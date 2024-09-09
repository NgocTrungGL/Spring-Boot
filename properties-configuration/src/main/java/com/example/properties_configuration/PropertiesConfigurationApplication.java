package com.example.properties_configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PropertiesConfigurationApplication {
	@Value("${university.name}")
	public String ten;
	@Value("${university.hub}")
	public String khoa;
	@Value("${university.address}")
	public String address;
	public static void main(String[] args) {
		SpringApplication.run(PropertiesConfigurationApplication.class, args);
	}
	@GetMapping("/")
	public String Print()
	{
		return "Nihongo ga omoshiroi";
	}
	@GetMapping("/info")
	public String print()
	{
		return "Ma Truong " + ten + " Khoa " + khoa + " Dia chi " + address;
	}
}
