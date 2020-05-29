package Mediator;

public class MediatorMain {

	public static void main(String[] args) {
		MessageMediator mediator = new ChatMessageMediator();
        
        UserFactory userFactory = new UserFactory();
        User George = userFactory.produceUser("Person", mediator);
        User Ivan = userFactory.produceUser("Person", mediator);
        User Petar = userFactory.produceUser("Person", mediator);
        User Bot1 = userFactory.produceUser("Bot",mediator);
        
        George.create();
        Ivan.create();
        Petar.create();
        Bot1.create();
        
        
        
        George.send("Hi All");
        Ivan.send("addBot");
        Petar.send("cat");
	}

}
