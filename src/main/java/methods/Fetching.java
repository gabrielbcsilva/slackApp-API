package methods;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.slack.api.Slack;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.SlackApiException;
import com.slack.api.methods.response.conversations.ConversationsListResponse;
import com.slack.api.methods.response.users.UsersListResponse;
import com.slack.api.model.Conversation;
import com.slack.api.model.User;


public class Fetching {
	private static String botToken = "place-your-token-here";
	
	  // You probably want to use a database to store any user information ;)
	public static final ConcurrentMap<String, User> usersStore = new ConcurrentHashMap<>();
	public static final ConcurrentMap<String, Conversation> conversationsStore = new ConcurrentHashMap<>();
	static Optional<List<Message>> conversationHistory = Optional.empty();
    /**
     * Fetch users using the users.list method
     */
    public void fetchUsers() {
        // you can get this instance via ctx.client() in a Bolt app
        MethodsClient client = Slack.getInstance().methods(botToken);
        Logger logger = LoggerFactory.getLogger("slack-app");
        try {
            // Call the users.list method using the built-in WebClient
           UsersListResponse result = client.usersList(r -> r
                // The token you used to initialize your app
                .token(System.getenv(botToken))
            );
            saveUsers(result.getMembers());
//           logger.info("result {}", result);
        } catch (IOException | SlackApiException e) {
            logger.error("error: {}", e.getMessage(), e);
        }
    }
    private static void saveUsers(List<User> users) {
        for (User user : users) {
            // Store the entire user object (you may not need all of the info)
            usersStore.put(user.getId(), user);
        }
    }

   public void fetchConversations() {
        MethodsClient client = Slack.getInstance().methods(botToken);
        Logger logger = LoggerFactory.getLogger("my-awesome-slack-app");
        try {
    
            ConversationsListResponse result = client.conversationsList(r -> r
                .token(System.getenv(botToken))
            );
            
//           System.out.println( result.getChannels());
            saveConversations(result.getChannels());
        } catch (IOException | SlackApiException e) {
            logger.error("error: {}", e.getMessage(), e);
        }
    }

    /**
     * Put conversations into an object
     */
    private static void saveConversations(List<Conversation> conversations) {
        for (Conversation conversation : conversations) {
            conversationsStore.put(conversation.getId(), conversation);
        }
    }

  
}
