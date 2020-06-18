
public class Exercise3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		
		System.out.println(x+=2);
		System.out.println(x=x+2);
		
		int num = 10;
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
		
		num = 777;
		System.out.println(num/100*100);
		System.out.println(num/10*10+1);
		System.out.println((num/10+1)*10%num);
		
		int f = 100;
		float c = (int)((5.0/9 *(f-32))*100+0.5)/100.0f;
		System.out.println(c);
		
		System.out.printf("%c, %c",95, 96);
	}
}
