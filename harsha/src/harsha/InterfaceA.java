package harsha;

public interface InterfaceA {
	
	public void show();
	public void display();
	default void home()
	{
		System.out.println("hello");
	}

}
