import java.util.Scanner;

class Final {
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		final double CALCULATOR_PI = 3.14159;
		double num;
		System.out.println("원의 넓이를 구하기 위해 반지름을 입력하시오.");
		System.out.println("원의 넓이는 (반지름) x (반지름) x (원주율) 입니다 ");
		num = scanner.nextInt();
		double result = CALCULATOR_PI * num * num ;
		System.out.println("당신이 입력한 반지름은 " + num + "입니다");
		System.out.println("원의 넓이 : " + result);
	}
}
