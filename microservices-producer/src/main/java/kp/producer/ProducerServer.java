package kp.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * The producer server.<br>
 * The microservice <b>producer-service</b> is registered with the <b>Eureka</b>
 * Service Discovery Server.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProducerServer {

	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProducerServer.class, args);
	}
}
