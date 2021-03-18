package Practise;

abstract class Demo {
	abstract void cool();
}
class Small extends Demo{
	 void cool(){
		 System.out.println("drinks");
	 }
}
 

class Sample31{
	public static void main(String[] args) {
	Small S=new Small();
	S.cool();		
	}
}
