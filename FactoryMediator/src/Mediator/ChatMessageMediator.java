package Mediator;

import java.util.ArrayList;
import java.util.List;


public class ChatMessageMediator implements MessageMediator {
	 private List<User> users;

	    public ChatMessageMediator() {
	        this.users = new ArrayList<>();
	    }

	    @Override
	    public void sendMessage(String message, User user) {
	        for (User u : this.users) {
	        	 //message should not be received by the user sending it
	        	if (u != user) {
	                u.receive(message);
	            }
	        }
	        if(message == "addBot") {
	        	System.out.println(user.getName() + " has called for a bot to watch over the chat, be carefull");
	        }
	        if(message == "cat") {
       		 System.out.println(user.getName() + " has been banned by the bot, because he wrote: " + message);
       		this.users.remove(user);
       	}
	    }
	    @Override
	    public void addUser(User user) {
	        this.users.add(user);
	    }

}
