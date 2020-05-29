package Mediator;

public abstract class User {

	protected MessageMediator mediator;
    protected String name;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public abstract void send(String msg);

    public abstract void receive(String msg);

	public abstract void create();
}
