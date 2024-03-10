package loop.ex;

public class prob3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int max = 3;

        // while
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        // for
        sum = 0;
        for (i = 1; i <= max; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
