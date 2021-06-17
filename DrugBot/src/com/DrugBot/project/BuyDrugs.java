package com.DrugBot.project;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BuyDrugs extends ListenerAdapter{
	
	@Override
	public void onMessageReceived(MessageReceivedEvent event) { 
		//this code send messages to random people
		if(event.getMessage().getContentRaw().equals("!hello")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("hi :wave:" + event.getMember().getAsMention()).queue();
		}
		//this code send messages to random people
		if(event.getMessage().getContentRaw().equals("!hi")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("Howdy :wave:").queue();
		}
		//this code send messages to random people
		if(event.getMessage().getContentRaw().equals("!hello bot")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("Hello to you too").queue();
		}
		//this code send messages to random people
		if(event.getMessage().getContentRaw().equals("!secret")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("This server sells drugs :shushing_face:").queue();
		}
		//this code send messages to random people
		if(event.getMessage().getContentRaw().equals("!drugs")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("Cocaine = $100, malawana = $900, wall = $100.000").queue();
		}
		if(event.getMessage().getContentDisplay().equals("!joke 1")) {
			event.getChannel().sendMessage("Why was 6 afraide of 9 because 9, 8, 7").queue();
		}
		if(event.getMessage().getContentRaw().equals("!joke 2")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("Why do bees have stiky hair. because they use honeycombs").queue();
		}
		if(event.getMessage().getContentRaw().equals("!joke 3")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("Knock knock who's there cargo, cargo who. Car go toot, toot, vroom, vroom").queue();
		}
		if(event.getMessage().getContentRaw().equals("!buy drugs 1")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("Here you go some cocaine").queue();
		}
		if(event.getMessage().getContentRaw().equals("!buy drugs 2")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("Here you go some malawana").queue();
		}
		if(event.getMessage().getContentRaw().equals("!buy drugs 3")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("Here you go some wall").queue();
		}
		if(event.getMessage().getContentRaw().equals("!info")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("@everyone Hey everybody i fixed the bot now type !hello, !hi, !drugs, !secret, !joke 1, !joke 2, !joke 3, !buy drugs 1, !buy drugs 2, !buy drugs 3").queue();
		}
		if(event.getMessage().getContentRaw().equals("!joe")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("Joe mama").queue();
		}
		
	}
	

}
