
 class b {
	public b() {
		this(5);
		System.out.println("asdf");
        }
	public b(int x){
	System.out.println(x);	
	}
	public void m() {System.out.println("m");}
	public void n()
	{
		System.out.println("n");
		System.exit(1);
		m();
	}
}
	
public class asd{	
	public static void main(String[] args) {
		b a=new b();
		a.n();
		
	}
}
