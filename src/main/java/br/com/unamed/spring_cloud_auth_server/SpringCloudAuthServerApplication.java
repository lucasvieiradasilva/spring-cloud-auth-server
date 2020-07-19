package br.com.unamed.spring_cloud_auth_server;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
public class SpringCloudAuthServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAuthServerApplication.class, args);
	}
	
	// TODO remover
	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
}