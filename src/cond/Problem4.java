package cond;

public class Problem4 {
    public static void main(String[] args) {
        double rating = 7;
//        String movie;

        if (rating <= 9) {
            System.out.println("어바웃타임을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("토이 스토리를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("고질라를 추천합니다.");
        }
    }
}
