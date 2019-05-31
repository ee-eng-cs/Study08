package kp.producer;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kp.common.Content;

/**
 * The producer controller.
 * 
 */
@RestController
public class ProducerController {
	private Logger logger = Logger.getLogger(ProducerController.class.getName());

	/**
	 * Produces the content.
	 * 
	 * @return the content
	 */
	@RequestMapping("/content")
	public Content produce() {

		final Content content = Content.getInstance();
		logger.info("produce(): content text[" + content.getText() + "]");
		return content;
	}
}