package test;

import messageDesign.*;
import methods.Fetching;
import methods.Message;

public class slackSendingMessage {

	public static void main(String[] args) throws Exception {
//Criando objeto mensagem
		Message messageObj = new Message();
//Chamando um desing de mensagem prontas (chamados blocks) Você pode fazer pelo site do slack Block Builder
		String textWelcome = new Blocks().welcomeMessage();

		sendToAll(messageObj, textWelcome);

	}

	private static void sendToAll(Message messageObj, String textWelcome) {
		// Instanciando objeto que busca id no slack
		Fetching fetch = new Fetching();
		// Buscando por id de channels no slack para enviar para todos em forma de loop
		fetch.fetchConversations();

		// A ideia aqui é enviar buscando todos os grupos
		for (String key : Fetching.conversationsStore.keySet()) {
			messageObj.PublishMessageBlocks(key, textWelcome);
		}
	}

}
