import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String n = sc.next();
//        try {
//            String reverse = "";
//            for(int i = n.length()-1; i>=0;i--){
//                reverse=reverse+ n.charAt(i);
//            }
//            int a = Integer.parseInt(reverse);
//            System.out.println(a);
//        }catch (Exception e){
//            System.out.println(e);
//        }


        int n = sc.nextInt();
        int count = 0;
        try {
            while (n!=0){
                int a = n%10;
                count = count*10+a;
                n=n/10;
            }
            System.out.println(count);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
