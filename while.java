import java.util.Scanner;

class While {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를  입려하시오.);
		int num = scanner.nextInt();

		if (num == 100){
			System.out.println("만점 A+ 학점입니다.");
		}
		else if ((num < 100) || (num < 90)){
			System.out.println(num + "점 이시군요 A 학점입니다.");
		}
	}
}

// if문 사용
