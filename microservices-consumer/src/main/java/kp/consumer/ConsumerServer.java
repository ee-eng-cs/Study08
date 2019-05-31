package kp.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/*-
With @EnableCircuitBreaker annotation is enabled a Hystrix circuit breaker.
Hystrix is a latency and fault tolerance library.
*/
/**
 * The consumer web server.<br>
 * This is a microservice <b>producer-service</b> client.<br>
 * It uses the <b>Eureka</b> Discovery Server to find the microservice.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@ComponentScan(useDefaultFilters = false) // disable component scanner
public class ConsumerServer {

	/**
	 * The URL uses the logical name of the <b>producer-service</b>.
	 */
	public static final String PRODUCER_SERVICE_URL = "http://PRODUCER-SERVICE";

	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConsumerServer.class, args);
	}

	/**
	 * A customized RestTemplate that has the Netflix <b>Ribbon</b> client-side load
	 * balancer build in.
	 * 
	 * @return the REST template
	 */
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/**
	 * Creates the consumer service.
	 * 
	 * @return the service
	 */
	@Bean
	public ConsumerService consumerService() {
		return new ConsumerService(PRODUCER_SERVICE_URL);
	}

	/**
	 * Creates the consumer controller.
	 * 
	 * @return the controller
	 */
	@Bean
	public ConsumerController consumerController() {
		return new ConsumerController(consumerService());
	}
}