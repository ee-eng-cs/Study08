package kp.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * It runs the <b>Eureka</b> registration server.
 * 
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistrationServer {

	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(RegistrationServer.class, args);
	}
}