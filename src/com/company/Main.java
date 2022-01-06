//package com.company;
//import java.util.*;
//public class Main {
//    public static void printMyName(String name ){
//        System.out.println(name);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        printMyName(name);
//    }
//}-----------------------------------------
//function to add two numbers
// package com.company;
//import java.util.*;
//public class Main {
//    public static int  Calculatesum(int a, int  b){
//        int sum = a+b;
//        return sum;
//    }
//    public static void main(String[]args){
// Scanner sc = new Scanner(System.in);
//  int a = sc.nextInt(); /*a=apna no mil gya */
//  int b = sc.nextInt(); /*a=apna no mil gya */
//  int sum = Calculatesum(a,b);
////        System.out.println("you ans is :" + sum );
//}
//
//}for multyplying two numbers
//package com.company;
//import java.util.*;
//public class Main {
//    public static float multiply( float a , float b){
//        float product = a*b;
//        return product;
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        float a= sc.nextFloat();
//        float b = sc.nextFloat();
//        float product= multiply(a,b);
//        System.out.println(" your ans " + product);
//}
//}
package com.company;
import java.util.*;
public class Main {
    public static void factorial(int a) {
        int ans = 1;
        for (int i = a; i >= 1; i--) {
         ans = ans * i;
        }
        System.out.println(ans);
        return;
    }
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         factorial(a);

}
}

