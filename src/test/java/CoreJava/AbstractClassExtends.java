package CoreJava;

public class AbstractClassExtends extends AnstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractClassExtends a=new AbstractClassExtends();
		a.m1body();
		a.color();
		a.m1body(1);
		a.m1body("sddS");
		
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("color");
	}

}
