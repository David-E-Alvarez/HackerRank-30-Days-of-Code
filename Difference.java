import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference; 
 public Difference(int[] passedArr){
        elements = new int[passedArr.length];
        for(int i = 0; i < passedArr.length; i++){
            //System.out.println("passedArr[" + i + "]: " + passedArr[i]);
            elements[i] = passedArr[i];
        }
    }
    
     public int computeDifference(){
        //TODO: find maxDiff
        maximumDifference = 0;
        //System.out.println("elements.length: " + elements.length);
        for(int i = 0; i < elements.length; i++){
            for(int j = 0; j < elements.length; j++){
                maximumDifference = Math.abs(Math.max(elements[i] - elements[j], maximumDifference));   
            }
        }
        
        return maximumDifference;
     }


} // End of Difference class

