import java.util.Scanner;

class While {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Score ! ");
		int num = scanner.nextInt();

		if (num == 100){
			System.out.println("Your Score : " + num + "    A+ Very Very Good !!");
		}
		else if ((100 > num) && (num > 90)){
			System.out.println("Your Score : " + num + "    A  VeryGood !!");
		}
		else if ((num < 90) && (num > 80)){
			System.out.println("Your Score : " + num + "    B+ So Good !!");
		}
		else if ((num < 80) && (num > 70)){
			System.out.println("Your Score : " + num + "    B  Not Bad !!");
		}
		else if ((num > 100) || (num < 0)){
			System.out.println("Re Input Please");
		}
		else {
			System.out.println("Your Score : " + num + "    You are Stupid !!");
		}
	}
}

// if문 사용
