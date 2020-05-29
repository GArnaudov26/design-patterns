package Mediator;

public class ChatBot extends User {

	@Override
	public void send(String msg) {
		// no implementation needed.

	}

	@Override
	public void receive(String msg) {
		 System.out.println(this.name + " receives:" + msg);

	}

	@Override
	public void create() {
		System.out.println("Bot Created");

	}

}
