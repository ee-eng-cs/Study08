package kp.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import kp.common.Content;

/**
 * Hide the access to the microservice <b>producer-service</b> inside this local
 * service.
 * 
 */
@Service
public class ConsumerService {

	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;

	protected String serviceUrl;

	/**
	 * Constructor.
	 * 
	 * @param serviceUrl the URL of a service
	 */
	public ConsumerService(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	/**
	 * Consumes content.
	 * 
	 * @return the content
	 */
	@HystrixCommand(fallbackMethod = "consumeFallback")
	public Content consume() {
		return restTemplate.getForObject(serviceUrl + "/content", Content.class);
	}

	/**
	 * The fallback method for content consuming.
	 * 
	 * @return the fallback content
	 */
	public Content consumeFallback() {
		return Content.getFallbackInstance();
	}
}