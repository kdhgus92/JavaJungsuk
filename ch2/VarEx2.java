
public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 4, y = 2;
		int tmp;
		
		System.out.println("x:"+x+" y:"+y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x="+x); 
		System.out.println("y="+y);
		System.out.println("x:"+x+" y:"+y);
	}

}
