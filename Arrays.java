import java.util.*;
public class Arrays {
    public static void main(String args[]){
        // int [] marks=new int[3]; // Arrays declare
        // marks[0]=98; //physics
        // marks[1]=90;//chemistry
        // marks[2]=97; // English
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        // }


        // second type of array declaration
        // int [] marks1={89,98,96};
        // for(int i=0;i<3;i++){
        //     System.err.println(marks[i]);
        // }
        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // int numbers[]=new int[size]; // array declare
        //Input
        // for(int i=0;i<size;i++){
        //     numbers[i]=sc.nextInt();
        // }

        //output
        // for(int i=0;i<size;i++){
        //     System.out.println(numbers[i]);
        // }

       // question --> Take an array as input from the user.Search for a given number X and Print the index at which it occurs.
    //    Scanner sc=new Scanner(System.in);
    //     int size=sc.nextInt();
    //     int numbers[]=new int[size];

        // input
        // for(int i=0;i<size;i++){
        //     numbers[i]=sc.nextInt();
        // }
        // int x=sc.nextInt();


        //output
        // for(int i=0;i<numbers.length;i++){
        //     if(numbers[i]==x){
        //         System.out.println("x found at index: " + i);
        //     }

        




       // ---------------------------------
       



   
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      String names[] = new String[size];


      //input
      for(int i=0; i<size; i++) {
          names[i] = sc.next();
      }
     
      //output
       for(int i=0; i<names.length; i++) {
           System.out.println("name " + (i+1) +" is : " + names[i]);
       }
      
   }




       
}


