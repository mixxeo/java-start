package array;

public class Array1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성, 0으로 자동 초기화 [0,0,0,0,0]

        // 자바는 배열을 생성할 때 그 내부값을 자동으로 초기화 한다.
        // 숫자는 0, boolean은 false, String은 null

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
        }

    }
}
