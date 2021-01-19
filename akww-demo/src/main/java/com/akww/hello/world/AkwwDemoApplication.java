package com.akww.hello.world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * http://localhost:80/swagger-ui.html
 * http://localhost:80/user/userList
 */
@SpringBootApplication
public class AkwwDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkwwDemoApplication.class, args);
		// new SpringApplication(AkwwDemoApplication.class).run(args);
	}

}
