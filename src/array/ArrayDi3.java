package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2*3 2차원 배열
        int[][] arr = new int[][]{
            {1, 2, 3},
            {4, 5, 6, 7}
        }; // 2차원 배열 초기화

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length ; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
