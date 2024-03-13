package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for (int i = 0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();

        // enhanced for (for each) - index, range(종료 조건) 필요x
        for (int number: numbers) {
            System.out.println(number);
        }

        // shortcut - iter
        for (int number : numbers) { }
    }
}
