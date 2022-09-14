import  java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        try {
            int n = sc.nextInt();
            int sum = 0;
            int multiplication = 1;
            while (n != 0) {
                int reminder = n % 10;
                sum += reminder;
                multiplication *= reminder;
                n = n / 10;
            }
            System.out.println(multiplication - sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
