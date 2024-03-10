package loop.ex;

public class prob2 {
    public static void main(String[] args) {
        // while
        int num = 2;
        int count = 0;
        while (count < 10) {
            System.out.println(num);
            num += 2;
            count++;
        }

        System.out.println();

        // for
//        for (count = 0, num=2;  count < 10; count++, num+=2) {
//            System.out.println(num);
//        }
        num = 2;
        for (count = 0; count < 10; count++) {
            System.out.println(num);
            num+=2;
        }
    }
}
