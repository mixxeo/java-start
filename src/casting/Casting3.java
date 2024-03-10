package casting;

public class Casting3 {
    public static void main(String[] args) {
        // overflow value casting

        long maxIntValue = 2147483647; // int 최고값
//        long maxIntOver = 2147483648; // int 최고값 + 1(초과)
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 강제 형변환 long -> int
        System.out.println("maxIntValue casing = " + intValue); //2147483647

        intValue = (int) maxIntOver; // long(int 범위 이상) -> int
        System.out.println("maxIntOver casting = " + intValue); // overflow 발생. -2147483648
        // int는 2147483648L를 표현할 수 없으니, 전혀 다른 숫자를 표현하게 됨. = 오버플로우
        // 오버플로우가 발생하지 않게 int type variable을 long type으로 바꿔야 함
    }
}
