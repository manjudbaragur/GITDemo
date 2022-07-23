package CoreJava;

public class InterfaceClass implements NewInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewInterface a=new InterfaceClass();
		a.green();
		a.yellow();
		a.red();

	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("green");
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("red");
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow");
	}

}
