import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");
//        ****
//        ****
//        ****
//        ****

        try{
            int a = sc.nextInt();
            for(int j = 1; j<=a;j++) {
                for (int i = 1; i <= a; i++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        catch (Exception e){

        }
    }
}