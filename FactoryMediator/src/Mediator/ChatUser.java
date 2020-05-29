package Mediator;

public class ChatUser extends User {
	
	
	
	@Override
	public void create() {
		System.out.println("User Created");
	}

	 @Override
	    public void send(String message) {
	        System.out.println(this.name + " sends: " + message);
	        mediator.sendMessage(message, this);

	    }

	    @Override
	    public void receive(String message) {
	        System.out.println(this.name + " receives:" + message);

	    }

}
