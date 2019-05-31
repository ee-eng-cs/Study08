package kp.consumer;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kp.common.Content;

/**
 * The consumer controller.
 * 
 */
@RestController
public class ConsumerController {
	private Logger logger = Logger.getLogger(ConsumerController.class.getName());

	@Autowired
	protected ConsumerService consumerService;

	/**
	 * Constructor.
	 * 
	 * @param consumerService the consumer service
	 */
	public ConsumerController(ConsumerService consumerService) {
		this.consumerService = consumerService;
	}

	/**
	 * Launches the consumer service.
	 * 
	 * @return the content
	 */
	@RequestMapping("/launch_consumer_service")
	public Content launchConsumerService() {

		final Content content = consumerService.consume();
		logger.info("launchConsumerService(): content text[" + content.getText() + "]");
		return content;
	}
}