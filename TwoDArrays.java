import java.util.*;
public class TwoDArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input rows and columns
        // int rows=  sc.nextInt();
        // int cols=sc.nextInt();
        //declare Array
        // int [][] matrix = new int [rows][cols];
        //Input 
        //outer loop - control Rows
        // for(int i=0;i<rows;i++){
        //    //Inner loop - control columns
        //    for(int j=0;j<cols;j++){
        //     matrix[i][j]=sc.nextInt();
        //    }
        // }
        //Output
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         System.out.print(matrix[i][j] +" ");
        //     }
        //     System.out.println();
        // }



       // ------------------------------------------
       //Questions --> Take a matrix as input from the user.Search for a given number
       //x and print the indices at which it occurs.
       //Input rows and columns
        int rows=  sc.nextInt();
        int cols=sc.nextInt();
        //declare Array
        int [][] matrix = new int [rows][cols];
        //input
        //for rows
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        int x=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                    //compare with x
                    if(matrix[i][j]==x){
                        System.out.println("x is found at location (" + i + "," + j +")");

                    }

                }
            }
            
        }

    }

