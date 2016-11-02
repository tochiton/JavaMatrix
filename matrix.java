import java.io.*;
import java.util.*;
import java.lang.String;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int [][] arrayTwoDimension = new int[6][6];
        Scanner reader = new Scanner(System.in);
                                                            // outer loop for the rows
        for(int i = 0; i < 6; ++i){    
            String num = reader.nextLine();                 // reads in whole input line
            String output = num.replaceAll("\\s+","");      // removes empty spaces
            char [] convertToChar = output.toCharArray();   // converts string into char array 
         
                                                             //inner loop for the columns               
                for(int j = 0; j < 6; ++j){
                    String temp = String.valueOf(convertToChar[i]);
                    arrayTwoDimension[i][j] = Integer.parseInt(temp);   
                    System.out.println(arrayTwoDimension[i][j]);
            }
            output, num = null;
        }
    }
}
