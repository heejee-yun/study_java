
public class test {

	public static void main(String[] args) {
	 int a = 10;
	 int b = 5;
	 
	 System.out.println(a + b );
	 System.out.println(a - b);
	 System.out.println(a * b);
	 System.out.println(a / b); // 몫
	 System.out.println(a % b); // 나머지

	 System.out.println(+a);
	 System.out.println(-a);
	 System.out.println(++a);
	 System.out.println(--a); // 왜 위에는 11인데 이건 그냥 10이지 ?

	 int v1 = 5;
	 int v2 = 2;

	 int result1 = v1 + v2; 
	 System.out.println("result1 :" + result1);
	 int result2 = v1 - v2; 
	 System.out.println("result2 :" + result2);
	 int result3 = v1 * v2; 
	 System.out.println("result3 :" + result3);
	 int result4 = v1 / v2; 
	 System.out.println("result4 :" + result4);
	 int result5 = v1 % v2; 
	 System.out.println("result5 :" + result5);
	 
	 
	 double i1 = 1.67;
	 double i2 = 0.625;	 
	 double i3 = 9.8;
	 double r1 = (i1-i2)*i3;
	 System.out.println("r1: " + r1);
	 
	 double A = 3.25-1.83;
	 double B = 0.705;
	
	System.out.println(5-(A)*B);
			 
	}

}
