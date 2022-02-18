package methods;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.slack.api.Slack;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.SlackApiException;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;



public class Message {
	
	private static String botToken = "place-your-token-here";
	

	
	public void PublishMessage(String id, String text) {
		// you can get this instance via ctx.client() in a Bolt app
		MethodsClient client = Slack.getInstance().methods();
		Logger logger = LoggerFactory.getLogger("slack-app");
		try {
			// Call the chat.postMessage method using the built-in WebClient
			ChatPostMessageResponse result = client.chatPostMessage(r -> r
					// The token you used to initialize your app
					.token(botToken).channel(id).text(text)
			// You could also use a blocks[] array to send richer content
			);
			
			
			// Print result, which includes information about the message (like TS)
			logger.info("result {}", result);
		} catch (IOException | SlackApiException e) {
			logger.error("error: {}", e.getMessage(), e);
		}
	}
	public void PublishMessageBlocks(String id, String block) {
		// you can get this instance via ctx.client() in a Bolt app
		MethodsClient client = Slack.getInstance().methods();
		Logger logger = LoggerFactory.getLogger("slack-app");
		try {
			// Call the chat.postMessage method using the built-in WebClient
			ChatPostMessageResponse result = client.chatPostMessage(r -> r
					// The token you used to initialize your app
					.token(botToken).channel(id).blocksAsString(block)
			// You could also use a blocks[] array to send richer content
			);
			
			
			// Print result, which includes information about the message (like TS)
			logger.info("result {}", result);
		} catch (IOException | SlackApiException e) {
			logger.error("error: {}", e.getMessage(), e);
		}
	}
	
	


}
