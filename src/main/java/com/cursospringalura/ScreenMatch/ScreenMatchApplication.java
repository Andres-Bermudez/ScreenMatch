package com.cursospringalura.ScreenMatch;

import com.cursospringalura.ScreenMatch.principal.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Menu menu = new Menu();
		while (true) {
			menu.mostrarMenu();
		}
	}
}
