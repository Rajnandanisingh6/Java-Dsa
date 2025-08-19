package com.rajnandani;
import java.util.*;
public class Patterns {
    public static void main(String[]args){
        // solid rectangle pattern

       // Scanner sc=new Scanner(System.in);
        /*int n=sc.nextInt();
        int m=sc.nextInt();
        // outer loop
        for(int i=1 ;i<=n;i++){
            // inner loop
            for(int j=1;j<=m;j++){
                 System.out.print("*");
            }
            System.out.println();
           
        }*/

        // hollow Rectangle
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        // // outer loops
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=m;j++){
        //         // cell->(i,j)
        //         if(i ==1|| j==1 || i==n || j==m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // ques 3. print half pyramid patterns


       /*  Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            */
            // ques 4. print inverted half pyramid
           /*  Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }*/

            // ques 5. print half pyramid 180 degrree rotated
           /* X int n=4;
            // outer loop
            for(int i=1;i<=n;i++){
                //inner loop -> space print hoga
                for(int j=1;j<=n-i;j++){
                   System.out.print (" ");
                }
                // inner loop --> star print
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
             }*/

              //ques no 6. print the half pyramid with numbers patterns
             /*   int n=5;
               // outer loop
               for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
               }
            */
            // ques 7.print the pattern inverted half pyramid with numbers
            /*int n=5;
            // outer loop
            for(int i=1;i<=n;i++){
                //inner loop
                for(int j=1;j<=n-i+1;j++){
                    System.out.print (j+" ");
                }
                System.out.println();
            }*/
            // ques no 8. print floyd's triangle
           /*  int n=5;
            int number=1;
            // outer loop
            for(int i=1;i<=n;i++){
                // inner loop
                for(int j=1;j<=i;j++){
                    System.out.print(number+" ");
                    number++;//number=number+1
                }
                System.out.println();
            }*/
            // ques 9. print 0-1 triangle pattern
             /*int n=5;
             // outer loop
             for(int i=1;i<=n;i++){
                // inner value
                for(int j=1;j<=i;j++){
                    int sum=i+j;
                    if(sum %2==0){// even
                        System.out.print("1 ");
                    }else{// odd
                        System.out.print("0 ");
                    }
                }System.out.println();
             }*/
            // ques 10.butterfly pattern
             /*int n=4;
             //upper half
             for(int i=1;i<=n;i++){
                // 1st part 
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                // spaces 
                int spaces=2*(n-i);
                for(int j=1;j<=spaces;j++){
                    System.out.print(" ");
                }
                // 2nd part
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
             }
             // lower half
                for(int i=n;i>=1;i--){
                // 1st part 
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                // spaces 
                int spaces=2*(n-i);
                for(int j=1;j<=spaces;j++){
                    System.out.print(" ");
                }
                // 2nd part
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            } */
           //ques 11. print solid rhombus pattern
          /* int n=5;
           for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
           } */
            //ques 12. print number Pyramid
            /*  int n=5;
             for(int i=1;i<=n;i++){
                //spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // numbers-> print row no.times
                for(int j=1;j<=i;j++){
                    System.out.print(i +" ");
                }
                System.out.println();
             }*/

             // ques 13. palindromic pattern
            /*int n=5;
            for(int i=1;i<=n;i++){
                //spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // 1st half numbers
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }

                //2nd half numbers
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }*/
            // ques 14.print diamond pattern
            int n=4;
            // upper half
            for(int i=1;i<=n;i++){
                // spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // stars
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();    
            }
            // lower half
            for(int i=n;i>=1;i--){
                // spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // stars
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }



        
    }
    
}
