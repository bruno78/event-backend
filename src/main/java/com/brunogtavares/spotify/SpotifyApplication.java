package com.brunogtavares.spotify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpotifyApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {

		return "Hey there! \n" +
				"This backend app provides a full CRUD for events stored data. \n" +
				"This app was built using Spring Boot and Postgres.";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpotifyApplication.class, args);
	}
}
