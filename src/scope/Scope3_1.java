package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // 임시 변수. 조건이 만족할 때만 필요함 -> if 문 내부에서 정의하는 것이 더 적절
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
