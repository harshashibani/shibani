package harsha;

public class Example implements InterfaceA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example ex=new Example();
ex.add();
ex.show();
ex.display();

InterfaceA inter= new Example();
inter.show();
inter.display();
inter.home();

	}

	@Override
	public void show() {
		System.out.println("show");		
	}

	@Override
	public void display() {
		System.out.println("display");		
		
	}
	
	public void add() {
		System.out.println("Add");		
		
	}

}
