package casting;

public class Casting1 {
    public static void main(String[] args) {
        // 작은 범위 숫자 타입에서 큰 범위 숫자 타입에 대입하는 것은 가능하다.
        // int -> long, double / long -> double
        // 단, 이때 형이 큰 범위의 변수형으로 변환되어서 저장되는 것임 -> "자동" 형변환
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = (long) intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = (double) intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20000000000L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
