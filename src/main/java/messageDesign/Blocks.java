package messageDesign;

public class Blocks {

	// estudar : https://app.slack.com/block-kit-builder/
public String welcomeMessage() {
	String block = "[\r\n"
			+ "		{\r\n"
			+ "			\"type\": \"section\",\r\n"
			+ "			\"text\": {\r\n"
			+ "				\"type\": \"mrkdwn\",\r\n"
			+ "				\"text\": \"Ol�, Sou o mais novo assistente de mensagens :smile: :purple_heart: minha miss�o � facilitar a sua rela��o com a plataforma por meio de *notifica��es e avisos*! \"\r\n"
			+ "			}\r\n"
			+ "		},\r\n"
			+ "		{\r\n"
			+ "			\"type\": \"divider\"\r\n"
			+ "		},\r\n"
			+ "		{\r\n"
			+ "			\"type\": \"section\",\r\n"
			+ "			\"text\": {\r\n"
			+ "				\"type\": \"plain_text\",\r\n"
			+ "				\"text\": \"Passando s� para dizer que sua ajuda faz muita diferen�a em nossa equipe :male-technologist:, espero que tenha um �timo dia! :nerd_face::handshake:\",\r\n"
			+ "				\"emoji\": true\r\n"
			+ "			}\r\n"
			+ "		},\r\n"
			+ "		{\r\n"
			+ "			\"type\": \"image\",\r\n"
			+ "			\"image_url\": \"https://istoe.com.br/wp-content/uploads/sites/14/2020/06/faustao-1-418x235.jpg\",\r\n"
			+ "			\"alt_text\": \"inspiration\"\r\n"
			+ "		}\r\n"
			+ "	]";
	return block;
}

}
