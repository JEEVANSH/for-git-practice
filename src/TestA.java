public class TestA {
public static void main(String[] args) {
	A1 a1= new A1();
	a1.setId(10);
	System.out.println(a1.getId());
	
	A2 a2=new A2();
	a1.setId(100);
	System.out.println(a1.getId());
	a2.setName("jeeevan");
	System.out.println(a2.getName());
}
}
