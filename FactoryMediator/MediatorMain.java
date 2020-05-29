package Mediator;

public class MediatorMain {

	public static void main(String[] args) {
		MessageMediator mediator = new ChatMessageMediator();
        User user1 = new ChatUser(mediator, "Peter");
        User user2 = new ChatUser(mediator, "Ivan");
        User user3 = new ChatUser(mediator, "Georgi");

        user1.send("Hi All");
        user3.send("addBot");
        user2.send("cat");
	}

}
