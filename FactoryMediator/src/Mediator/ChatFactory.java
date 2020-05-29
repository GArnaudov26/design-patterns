package Mediator;

public abstract class ChatFactory {
	
	public abstract User produceUser(String name, MessageMediator med);
	
	public User createUser(String name, MessageMediator med) {
		User person = createUser(name, med);
		person.create();
		return person;
	}
}
