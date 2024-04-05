
public class childClass extends parentClass {
	String name="Mahajan";
	
	public void getStringData() {
		System.out.println(super.name);
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		childClass c=new childClass();
		System.out.println(c.name);
		
		parentClass p=new childClass();
		System.out.println(p.name);
		
		parentClass p2=new parentClass();
		System.out.println(p2);
		
//		p.getStringData(); as p is of parent type and parent does not have this function
		
		c.getStringData();
		System.out.println(c.getData());
		// TODO Auto-generated method stub

	}

}
