
public class PrintfEx1 {
	public static void main(String[] args) {
//		System.out.println(10.0/3);
		
//		System.out.printf("%d%n", 15);
//		System.out.printf("%#o%n", 15);
//		System.out.printf("%#x%n", 15);
//		System.out.printf("%s%n", Integer.toBinaryString(15));
//		System.out.printf("%s%n", "1111");
//		
//		float f = 123.456789f;
//		double d = 123.456789;
//		System.out.printf("%f%n", f);
//		System.out.printf("%f%n", d);
//		System.out.printf("%e%n", d);
//		System.out.printf("%g%n", d);
//		
//		System.out.printf("[%5d]%n",10);
//		System.out.printf("[%-5d]%n",10);
//		System.out.printf("[%05d]%n",10);
//		System.out.printf("[%5d]%n",1234567);
//		
//		double d = 1.23456789;
//		System.out.printf("%f%n", d);
//		System.out.printf("%14.10f%n", d);
//		System.out.printf("%14.6f%n", d);
//		System.out.printf("%14.6f%n", d);
//		
//		System.out.printf("[%s]%n","www.codechobo.com");
//		System.out.printf("[%20s]%n","www.codechobo.com");
//		System.out.printf("[%-20s]%n","www.codechobo.com");
//		System.out.printf("[%.10s]%n","www.codechobo.com");
		
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%o, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		
		
	}
}
