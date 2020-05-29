package Mediator;

public class UserFactory extends ChatFactory {

	@Override
	public User produceUser(String name, MessageMediator med) {
		
		User person = null;
		
		if(name.equals("Person")) {
			person = new ChatUser();
			person.name = name;
			person.mediator = med;
		}
		if(name.equals("Bot")) {
			person = new ChatBot();
			person.name = name;
			person.mediator = med;
		}
		return person;
	}

}
