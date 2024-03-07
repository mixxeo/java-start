package cond;

public class Problem7 {
    public static void main(String[] args) {
        int x = 5;

        String res = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + res);
    }
}
