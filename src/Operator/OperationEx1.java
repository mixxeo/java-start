package Operator;

public class OperationEx1 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;

        int sum = num1 + num2 + num3;
        System.out.println("sum = " + sum);

        // int끼리 계산하면 소수점은 버림한다
        int average = sum / 3;
        System.out.println("average = " + average);
    }
}
