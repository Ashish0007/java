package java8;

public class ResourceCleanUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource = new Resource();
		
		resource.op1();
		resource.op2();

	}

}

class Resource{
	
	public Resource(){
		System.out.println("Creating.....");
	}
	
	public void op1(){
		System.out.println("Some op1");
	}
	
	public void op2(){
		System.out.println("Some op2...");
	}
	
	public void finalize(){
		System.out.println("external resource cleaned up");
	}
}