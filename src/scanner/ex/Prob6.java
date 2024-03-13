package scanner.ex;

import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int n1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        for (int i = n1 ; i <= n2; i++) {
            System.out.print(i);
            if (i != n2) {
                System.out.print(", ");
            }
        }
    }
}
