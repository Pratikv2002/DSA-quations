import java.util.*;
public class IsPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");

        try{
            int a = sc.nextInt();
            if(a<2){
                System.out.println("Composite");

            } else if (a==2) {
                System.out.println("Prime");
            }
            else {
                for (int i = 2; i<=a-1;i++){
                    if(a%i==0){
                        System.out.println("Composite");
                        break;
                    }
                    else {
                        if (i==a-1){
                            System.out.println("Prime");
                        }
                    }
                }
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}