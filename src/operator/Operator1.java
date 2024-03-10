package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // +
        int sum = a+b;
        System.out.println("a + b = " + sum); // 출력 a + b = 7

        // -
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // *
        int mult = a * b;
        System.out.println("a * b = " + mult);

        // 나누기
        int div = a / b; // => 2.5
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
