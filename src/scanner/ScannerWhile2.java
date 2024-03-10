package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫번째 숫자를 입력하세요: ");
            int n1 = scanner.nextInt();
            System.out.print("두번째 숫자를 입력하세요: ");
            int n2 = scanner.nextInt();

            if (n1 == 0 && n2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int sum = n1 + n2;
            System.out.println("합: " + sum);
        }
    }
}
