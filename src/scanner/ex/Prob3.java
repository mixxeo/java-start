package scanner.ex;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = scanner.nextLine();
        System.out.print("음식 가격을 입력해주세요: ");
        int foodPrice = scanner.nextInt();
        System.out.print("음식 수량을 입력해주세요: ");
        int foodQuantity = scanner.nextInt();

        System.out.println(foodName + " " + foodQuantity + "개를 주문하였습니다.");
        System.out.println("총 가격은 " + foodPrice * foodQuantity + "입니다.");

    }
}
