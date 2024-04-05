import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class demo {

	protected int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]=new int[5];
//		int arr[]= {1,2,3,4,5};
//		for(int i:arr) {
//			System.out.println(i);
//		}
		
		int matrix[][]= {{1,2},{3,4}};
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.println(matrix[i][j]);
			}
		}
//		try {
//		matrix[3][3];}
//		catch(Exception e) {
//			Sopln
//		}
		//String s1="hello";
		String s2="jello";
		
		//String s3=s1+s2;
		
		String s="Hello Good Evening Ananay";
		String[] s1=s.split(" ");
		for(String i:s1) {
			System.out.println(i);
		}
		
		
		HashMap<Integer,Integer> hm=new HashMap();
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3, 30);
		hm.put(4, 40);
		
		//HashSet hs=Map.Entry<int, int>(hm);
		
		for(int key:hm.keySet()) {
			System.out.println(hm.get(key));
		}
		
		Iterator i=hm.keySet().iterator();
		while(i.hasNext()) {
			System.out.println(hm.get(i.next()));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
