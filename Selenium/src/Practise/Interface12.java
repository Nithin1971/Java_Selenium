package Practise;
interface coo{
	void cool();
}
class doo implements coo{
	public void cool(){
		System.out.println("KF");
	}
}
public class Interface12 {
	public static void main(String[] args) {
		doo c=new doo();
		c.cool();		
	}
}
