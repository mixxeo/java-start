package casting;

public class Casting2 {
    public static void main(String[] args) {
        // 큰 값을 작은 타입에 넣는 경우, double, long -> int
        // 값의 손실이 발생하면 버그가 발생할 수 있으니 허용햐지 않고 컴파일 오류를 발생시킨다.

        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; //컴파일 오류 "lossy conversion, incompatible types"
        intValue = (int) doubleValue; // 명시적 형변환 필요(강제 형변환). doubleValue 값은 유지
        System.out.println("intValue = " + intValue); // 1

        System.out.println(10.5);
        System.out.println((int) 10.5);
    }
}
