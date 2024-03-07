package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                System.out.println("grade is 2");
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 4000;
        }

        System.out.println("발급받은 쿠폰 = " + coupon);
    }
}
