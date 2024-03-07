package Operator;

public class OperationEx2 {
    public static void main(String[] args) {
        double num1 = 1.5, num2 = 2.5, num3 = 3.5;

        double sum = num1 + num2 + num3;
        System.out.println("sum = " + sum);

        // int끼리 계산하면 소수점은 버림한다
        double average = sum / 3;
        System.out.println("average = " + average);
    }
}
