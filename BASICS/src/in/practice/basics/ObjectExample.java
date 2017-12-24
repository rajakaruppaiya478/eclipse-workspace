package in.practice.basics;

public class ObjectExample {
	int number=10;
	
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("started");
	}
	static {
		System.out.println("Stopped");
	}
	
	public ObjectExample() {
		System.out.println("raja");
	}
	public ObjectExample(String name) {
		System.out.println(name);
	}
	
	public void display() {
		System.out.println(number);
		System.out.println("Soundarya");
	}
	
	static {
		System.out.println("STOPPPPPPPPP");
	}

	public static void main(String[] args) {
		ObjectExample obj=new ObjectExample("Sound");
		ObjectExample obj1=new ObjectExample();
		obj.display();
		obj1.display();
		
	}

}
