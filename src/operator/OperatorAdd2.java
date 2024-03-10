package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        // 전위 증감 연산자
        b = ++a; // a의 값을 먼저 증가시키고 b에 대입
        // a = a + 1; b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 후위 증감 연산자
        a = 1; // initialize
        b = 0; // initialize
        b = a++; //b에 a의 현재값을 먼저 대입하고 a의 값을 증가시킴
        // b = a; a = a + 1;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
