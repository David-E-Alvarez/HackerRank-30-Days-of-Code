import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);  
        
        int num = input.nextInt();
        //System.out.println("num: " + num);
        String[] strings = new String[num];
        for(int i = 0; i < num; i++){
            strings[i] = input.next();
            for(int j = 0; j < strings[i].length(); j++){
                if(j % 2 == 0){
                    System.out.print(strings[i].charAt(j));
                    //System.out.println("j: " + j);
                }
            }
            System.out.print(" ");
            for(int k = 0; k < strings[i].length(); k++){
                if(k % 2 != 0){
                    System.out.print(strings[i].charAt(k));
                }
            }
            System.out.println();
        }
        
        
    }
}