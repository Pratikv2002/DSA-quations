import  java.util.*;
public class NumberOf1Bits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        try{
           int  count=0;
            while(n!=0){
                n = n&(n-1);
                count++;
            }
            System.out.println("Number of 1s are: "+count);
        }
        catch (Exception e){

        }
    }
}
