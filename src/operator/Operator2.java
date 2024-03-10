package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기
        String result1 = "hello " + "world";
        System.out.println(result1);

        String s1 = "string1";
        String s2 = "string2";
        String res2 = s1 + s2;
        System.out.println(res2);

        // 문자열과 숫자 더하기
        String res3 = "a + b = " + 10;
        // 숫자를 문자열로 형변환 해버림
        System.out.println(res3);

        int num = 20;
        String str = "a + b = ";
        String res4 = str + num;
        System.out.println(res4);

        // 쉽게 이야기해서 문자열에 더하는 것은 다 문자열이 된다.
    }
}
