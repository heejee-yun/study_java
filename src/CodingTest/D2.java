package CodingTest;

public class D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 구구단 2~9단 프로그램 작성하시오, 10줄 이하로!
		

		int i;
		int j;
		
		for (i = 2; i < 10; i++){
			for (j = 1; j <10; j++){
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		

		
		
//		2. int 타입의 변수를 2개 선언하고 두 정수가 주어졌을 때 두 정수를 비교하고 크기 비교 결과를 나타내는 프로그램을 작성하시오.
		
		int a = 9;
		int b = 6;
		
		if (a >b ) {
			System.out.println("a가 b보다 작습니다 ");
		}else if (a < b) {
			System.out.println("b가 a보다 작습니다 ");
		}else {
			System.out.println("a와 b는 같습니다  ");
		}

//		3. 몇 사분면에 있는지 구하기 
		
		int x = -3;
		int y = 3;
		
		
		if(x >0 && y > 0) {
			System.out.println("1사분면");
		}else if(x < 0 && y > 0 ){
			System.out.println("2사분면");
		}else if (x < 0 && y < 0) {
			System.out.println("3사분면");
		}else if (x > 0 && y < 0) {
			System.out.println("4사분면");
		}
		else {
			System.out.println("0.0에 있습니다");
		}
		
		
		
		
	}

}

