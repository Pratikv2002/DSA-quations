import java.util.*;
public class NPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");

        try {
            int a = sc.nextInt();
            for (int j = 0; j <= a; j++) {
                if (j == 2) {
                    System.out.println(j);
                } else {
                    for (int i = 2; i <= j - 1; i++) {
                        if (j % i == 0) {
                            break;
                        } else {
                            if (i == j - 1) {
                                System.out.println(j);
                            }
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
