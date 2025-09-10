package Practice_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //Arrays
      /*   
        int physics =97;
        int chem=89;
        int eng =87;
        int [] marks=new int[3];
        marks[0]=97;
        marks[1]=89;
        marks[2]=87;
       // System.out.println(marks[0]);
       //length

     //    System.out.println(marks.length);

       //sort
       System.out.println(marks[0]);
       Arrays.sort(marks);
       System.out.println(marks[0]);

       */
    //   int [] marks ={98,90,97};
    //   int [][] finalMarks={{98,90,97},{95,93,92}};
    //   System.out.println(finalMarks[0][0]);

    //Casting
    //Implicit Casting
    // double price =100.00;
    // double finalPrice = price +18;

    // System.out.println(finalPrice);

    //--------------------
    //Explicit Casting
    // int p=100;
    // int fp =p + (int)18.0;
    // System.out.println(fp);

    //---------------------------
    //Constants
    // int age =30;
    
    // final float PI =3.14F;

    //Operators
    //Arithmetic Operators
    //Assignments Operators
    //Logical Operators
    //Comparision Operators

    //Arithmetic Operators
    // int a=3;
    // int b=5;
    // int sum=a+b;
    // System.out.println(sum);

    // double a=5;
    // double b=3;
    // int diff=a-b;
    // int mul =a*b;
    // double div=a / b;
    // double modulo=a % b;

    // System.out.println(diff);
    // System.out.println(mul);
    // System.out.println(modulo);


    //Assignments Operators
    // int numb=1;
    // numb =numb +1;
   // numb++; uniary operator
    //    System.out.println(++numb);//2
     //    System.out.println(numb);//2

   //Math Class
   //5,6
  //  System.out.println(Math.max(5,6));
  //  System.out.println(Math.min(5,6));
  //  //random 0.0 se 1.0 tak 
  //  System.out.println(Math.random());
  //  System.out.println((int)(Math.random()*100));


   //Input in Java
  //  Scanner sc=new Scanner(System.in);
  //  System.out.println("Input Youur Name : ");
  //  int age =sc.nextInt();
  //  System.out.println(age);
  // String name =sc.next();
  // System.out.println(name);

  //--------------------------------
  //Comparison Operators
  //a == b
  //a !=b
  //a<b
  //a>b
  //a>=b


  //Conditional Statements
  // boolean isSunUp = true;
  // if(isSunUp == true)
  //      System.out.println("day");
  // else
  //     System.out.println("night");
  

  // int age =38;
  // if(age>18){
  //   System.out.println("Can vote");
  // }
  // else{
  //   System.out.println("can't vote");
  // }
     
  // logical Operators

  //&& -- and
  // int a=30;
  // int b=40;
// if(a<50 && b<50)
//      System.out.println("both less than 50");
     

     // || -- or
    //  if(a<50 || b<50)
    //  System.out.println("atleast one less than 50");
    // }  
    

    // boolean isAdult =false;
    // if(!isAdult)
    //   System.out.println("is adult");
    // else 
    //     System.out.println("not adult");


    //-----------------------------------
    // Scanner sc = new Scanner(System.in);
    // //pen =10; notebook=40

    // int cash =sc.nextInt();
    // if(cash<10){
    //   System.out.println("cannot buy anything");
    //   System.out.println("get more cash");
    // }
    // else if(cash > 10 && cash < 50){
    //   System.out.println("can get 1 thing");
    // }
    // else{
    //   System.out.println("can get both");
    // }


    //Switch Statements
    // int day =1;
    // switch(day){
    //   case 1 : 
    //          System.out.println("monday");
    //          break;
    //   case 2: 
    //          System.out.println("tuesday");
    //   case 3: 
    //          System.out.println("wednesday");
    //   case 4: 
    //          System.out.println("friday");  
    //   case 5: 
    //          System.out.println("saturday"); 
    //   case 6: 
    //          System.out.println("sunday"); 
    //    default:
    //           System.out.println("we -sun");                         
    // }


    //-------------------------------

    //loops

    //for loop

    // for(int i=1; i<=100;i++){
    //   System.out.println(i);
    // }

    //while loop
    // int i =100;
    // while(i >= 1){
    //   System.out.println(i);
    //   i =i-1;

    // }

    //do while
    // int k=100;
    // do{
    //   System.out.println(k);
    //   k=k-1;
    // }while(k >=1);


    //----------------------------
    Scanner sc =new Scanner(System.in);
    int number =0;

    do{
      System.out.println("Input a number");
      number = sc.nextInt();
      System.out.print("here is your number :");
      System.out.println(number);
    }while(number>=0);

    System.out.println("THE END");


}
}
