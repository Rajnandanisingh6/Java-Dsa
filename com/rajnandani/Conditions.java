package com.rajnandani;
// public class Main{
//     public static void main(String[]args){
//         // output
//         System.out.print("hello java\n");
//         System.out.println("hello java");
//         // ln -- use ffor nextline
//         // \n -- use for nextline


//     }
// }
// public class Main{
//     public static void main(String[]args){
//         // ques
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//     }
// }

// public class Main{
//     public static void main(String []args){
//         // variables
//         // java is a typed language mean koi bhi variable likhne se phle batna padega ki kis type ka variable hai
//         int a=10;
//         int b=15;
//         int sum = a + b;
//        System.out.println(sum);
//        int diff = b -a;
//        System.out.println(diff);
//        int mul=a*b;
//        System.out.println(mul);
//     }

// }

/* import java.util.*;// package
// Scanner class also use for take input from user
public class Main{
    public static void main(String[]args){
        // Input
        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();// nextLine use for full line ke liye bas one word karna ho tab next ka use karenge
        // System.out.println(name);
        // nextInt()-- use int type
        //nextFloat()-- use for float type
        // ques take 2 variables 'a'& 'b' and print their sum.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum =a + b;
        System.out.println(sum);


    }
}*/
// conditional statements
import java.util.*;
public class Conditions {

    public static void main(String[] args){ 
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age > 18){
        //     System.out.println("adult");
        // }else{
        //     System.out.println("not adult");
        // }
           // even  odd check ques 

        // Scanner sc = new Scanner(System.in);
        // int num= sc.nextInt();
        // if(num%2==0){
        //     System.out.println("even");
        // }else{
        //     System.out.println("odd");
        // }

         // check greater lesser number
        /*Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("equal");
        } else if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("a is lesser");
        }  
        // }else{
        //     if(a>b){
        //     System.out.println("a is greater");
        */
         // ques print greeting with the help of if else
        //Scanner sc = new Scanner(System.in);
        //int button=sc.nextInt();
        // if(button==1){
        //     System.out.println("Hello");
        // }else if(button==2){
        //     System.out.println("Namaste");
        // }else if(button==3){
        //     System.out.println("Bonjour");
        // }else{
        //     System.out.println("invaild Button ");
        // }
         // switch use for clean purpose of code 
        /* switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default :System.out.println("Invalid Button");
        }  */
          // homework problem
          // ques 1 . make a calculator
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator=sc.nextInt();
        switch(operator){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:if(b==0){
                System.out.println("invalid division");
            }else{
                System.out.println(a/b);
            }
            break;
            case 5:if(b==0){
                System.out.println("invalid Division");
            }else{
                System.out.println(a%b);
            }
            break;
            default:System.out.println("Invalid Operator");
        }*/

        // ques 2
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        switch(month){
            case 1:System.out.println("january");
            break;
            case 2:System.out.println("februrary");
            break;
            case 3:System.out.println("march");
            break;
            case 4:System.out.println("april");
            break;
            case 5:System.out.println("may");
            break;
            case 6:System.out.println("june");
            break;
            case 7:System.out.println("july");
            break;
            case 8:System.out.println("august");
            break;
            case 9: System.out.println("september");
            break;
            case 10:System.out.println("october");
            break;
            case 11:System.out.println("november");
            break;
            case 12:System.out.println("december");
            break;
            default:System.out.println("Invalid month");
        }
    } 
}
