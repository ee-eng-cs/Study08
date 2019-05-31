package kp.common;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * The content.
 *
 */
public class Content {

	private String text;
	private static final List<String> textslist = Arrays.stream("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""))/*-*/
			.collect(Collectors.toList());
	private static final AtomicInteger atomic = new AtomicInteger();

	/**
	 * The constructor.
	 * 
	 */
	private Content() {
		super();
	}

	/**
	 * Gets the new instance of the <b>Content</b> object.
	 * 
	 * @return the content
	 */
	public static Content getInstance() {

		final Content content = new Content();
		final int index = atomic.getAndIncrement() % textslist.size();
		content.text = textslist.get(index);
		return content;
	}

	/**
	 * Gets the fallback instance of the <b>Content</b> object.
	 * 
	 * @return the fallback content
	 */
	public static Content getFallbackInstance() {

		final Content content = new Content();
		content.text = "fallback";
		return content;
	}

	/**
	 * Gets the text.
	 * 
	 * @return the text
	 */
	public String getText() {
		return text;
	}
}