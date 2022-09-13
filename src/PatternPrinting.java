import java.util.*;
public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();

          try {
//                pattern 1
//                   *****
//                   *****
//                   *****
//                   *****
//              for (int j = 1 ; j<=n; j++) {
//                  for (int i = 1; i <= n; i++) {
//                      System.out.print("*");
//                  }
//                  System.out.println();


//               pattern 2
//              1111
//              2222
//              3333
//              4444
//              for (int j=1;j<=n;j++) {
//                  for (int i = 1; i <= n; i++) {
//                      System.out.print(j);
//                  }
//                  System.out.println();
//              }


//          pattern 3
//              1234
//              1234
//              1234
//              1234

//              for (int j=1;j<=n;j++) {
//                  for (int i = 1; i <= n; i++) {
//                      System.out.print(i);
//                  }
//                  System.out.println();
//              }


//                Pattern 4
//              123
//              456
//              789


//            int a = 1;
//              for (int j=1;j<=n;j++) {
//                  for (int i = a; i <= n+a; i++) {
//                      if(i%n==0){
//                          a = i+1;
//                          System.out.print(i);
//                          break;
//                      }
//                      System.out.print(i);
//                  }
//                  System.out.println();
//              }

//              int a = 1;
//              for (int j=1;j<=n;j++) {
//                  for (int i = 1; i <= n; i++) {
//                      System.out.print(a+" ");
//                      a++;
//                  }
//                  System.out.println();
//              }


//              Pattern 5
//              *
//              **
//              ***
//              ****

//              for(int i = 1; i<=n;i++){
//                  for (int j = 1; j<=i; j++){
//                      System.out.print("*");
//                  }
//                  System.out.println();
//              }



//              Pattern 6
//              1
//              22
//              333
//              4444

//              for(int i = 1; i<=n;i++){
//                  for (int j = 1; j<=i; j++){
//                      System.out.print(i);
//                  }
//                  System.out.println();
//              }

//              Pattern 7
//              1
//              23
//              456
//              78910
//              int a = 1;
//              for(int i = 1; i<=n;i++){
//                  for (int j = 1; j<=i; j++){
//                      System.out.print(a);
//                      a++;
//                  }
//                  System.out.println();
//              }


//              Pattern 8
//              1
//              23
//              345
//              4567
//             int a = 0;
//              for(int i = 1; i<=n;i++){
//                  for (int j = i; j<=i+a; j++){
//                      System.out.print(j);
//                  }
//                  a++;
//                  System.out.println();
//              }

//              Pattern 9
//              1
//              21
//              321
//              4321
//             int a = 0;

//              for(int i = 1; i<=n;i++){
//                  for (int j = i; j>=1; j--){
//                      System.out.print(j);
//                  }
//                  System.out.println();
//              }


//              Pattern 10
//              AAA
//              BBB
//              CCC

//               char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//              for (int i = 0; i<n;i++){
//                  for (int j=0;j<n;j++){
//                      System.out.print(arr[i]);
//                  }
//                  System.out.println();
//              }



//              Pattern 11
//              ABC
//              ABC
//              ABC

//              char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//              for (int i = 0; i<n;i++){
//                  for (int j=0;j<n;j++){
//                      System.out.print(arr[j]);
//                  }
//                  System.out.println();
//              }

//              Pattern 12
//                   ABC
//                   DEF
//                   GHI

//              char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//              int a = 0;
//              for (int i = 0; i<n;i++){
//                  for (int j=0;j<n;j++){
//                      System.out.print(arr[a]);
//                      a++;
//                  }
//                  System.out.println();
//              }

//              Pattern 13
//                   ABC
//                   BCD
//                   CDE

//              char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//              int a = 0;
//              for (int i = 0; i<n;i++){
//                  for (int j=i;j<n+a;j++){
//                      System.out.print(arr[j]);
//
//                  }
//                  a++;
//                  System.out.println();
//              }


//              Pattern 14
//                   A
//                   BB
//                   CCC

//              char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//
//              for (int i = 0; i< n;i++) {
//                  for (int j = 0; j <=i; j++) {
//                      System.out.print(arr[i]);
//                  }
//                  System.out.println();
//              }


//              Pattern 15
//                   A
//                   BC
//                   DEF

//              char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//              int a = 0;
//              for (int i = 0; i< n;i++) {
//                  for (int j = a; j <=i+a; j++) {
//                      System.out.print(arr[j]);
//                      a++;
//                  }
//                  System.out.println();
//              }


//              Pattern 16
//                   A
//                   BC
//                   CDE
//                   DEFG

//              char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//              int a = 0;
//              for (int i = 0; i< n;i++) {
//                  for (int j = i; j <=i+a; j++) {
//                      System.out.print(arr[j]);
//
//                  }
//                  a++;
//                  System.out.println();
//              }

//              Pattern 17
//                   D
//                   CD
//                   BCD
//                   ABCD

//              char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//              int a = n-1;
//              for (int i = 0; i<n;i++){
//                  for (int j = a ; j<n ;j++){
//                      System.out.print(arr[j]);
//                  }
//                  a--;
//                  System.out.println();
//              }

//              Pattern 18
//                   ABC
//                   BCD
//                   CDE


//              char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//              for (int i = 0; i<n;i++){
//                  for (int j = i ; j<n+i ;j++){
//                      System.out.print(arr[j]);
//                  }
//                  System.out.println();
//              }


//              Pattern 19
//                     *
//                    **
//                   ***
//                  ****

//              int a = n;
//              for (int i = 0; i<n ; i++) {
//                  for(int j =0;j<a-1;j++){
//                      System.out.print("  ");
//                  }
//                  for (int k = 0; k<=i;k++){
//                      System.out.print("* ");
//                  }
//                  System.out.println();
//                  a--;
//              }

//              Pattern 20
//                  ****
//                  ***
//                  **
//                  *

//              for (int i = n; i>0 ; i--) {
//                  for (int k = i; k>0;k--){
//                      System.out.print("* ");
//                  }
//                  System.out.println();
//
//              }


//              Pattern 21
//                 ****
//                  ***
//                   **
//                    *
//              int a = n;
//              for (int i = n; i>0 ; i--) {
//                  for (int j = a; j<n; j++){
//                      System.out.print(' ');
//                  }
//                  for (int k = i; k>0;k--){
//                      System.out.print("*");
//                  }
//                  System.out.println();
//                  a--;

//              }

//              Pattern 22
//                 1111
//                  222
//                   33
//                    4

//              int a = n;
//              for (int i = 1; i<=n ; i++) {
//                  for (int j = a; j<n; j++){
//                      System.out.print(' ');
//                  }
//                  for (int k = i; k<=n;k++){
//                      System.out.print(i);
//                  }
//                  System.out.println();
//                  a--;
//                }


//              Pattern 23
//                    1
//                   22
//                  333
//                 4444

//              int a = n-1;
//              for (int i = 1; i<=n ; i++) {
//                  for (int j = 0; j<a; j++){
//                      System.out.print(' ');
//                  }
//                  for (int k = 0; k<i;k++){
//                      System.out.print(i);
//                  }
//                  System.out.println();
//                  a--;
//              }


//              Pattern 24 two solN
//                 1234
//                  234
//                   34
//                    4

//              int a = 1;
//              for (int i = 1; i<=n ; i++) {
//                  for (int j = 1; j<a; j++){
//                      System.out.print(' ');
//                  }
//                  for (int k = i; k<=n;k++){
//                      System.out.print(k);
//                  }
//                  System.out.println();
//                  a++;
//              }

//            OR
//              for (int i = 1; i<=n ; i++) {
//                  for (int j = n; j<n+i; j++){
//                      System.out.print(' ');
//                  }
//                  for (int k = i; k<=n;k++){
//                      System.out.print(k);
//                  }
//                  System.out.println();
//              }


//              Pattern 25
//                   1
//                  23
//                 456
//                78910

//              int a = 1;
//              for (int i = 1; i<=n ; i++) {
//                  for (int j = 1; j<=n-i; j++){
//                      System.out.print(' ');
//                  }
//                  for (int k = 1; k<=i;k++){
//                      System.out.print(a);
//                      a++;
//                  }
//                  System.out.println();
//
//              }


//              Pattern 26
//                   1
//                  121
//                 12321
//                1234321

//              int a = 1;
//              for (int i = 1; i<=n ; i++) {
//                  for (int j = 1; j<=n-i; j++){
//                      System.out.print(' ');
//                  }
//                  for (int k = 1; k<=i;k++){
//                      System.out.print(k);
//                      a++;
//                  }
//                  for (int m = i-1; m>=1;m--){
//                      System.out.print(m);
//                  }
//                  System.out.println();
//
//              }


//              Pattern 27
//        1234554321
//        1234**4321
//        123****321
//        12******21
//        1********1

              for(int i=0; i<n; i++){
                  for(int j = 1; j<=n-i; j++){
                      System.out.print(j);
                  }

                  for(int k = 0; k<i*2;k++){
                      System.out.print("*");
                  }

                  for (int l = n-i; l>0;l--){
                      System.out.print(l);
                  }
                  System.out.println();
              }


          }catch (Exception e){
              System.out.println(e);
          }
    }
}
