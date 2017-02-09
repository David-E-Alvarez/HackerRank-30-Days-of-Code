import java.util.*;
import java.io.*;

//Write your code here
class Calculator{
    /*Calculator(){
        System.out.println("Calculator class successfully created");
    }*/
    
    int power(int anN, int aP) throws Exception{
        //System.out.println("anN: " + " " + "aP: " + aP);
        if(anN < 0 || aP < 0){
            throw new Exception("n and p should be non-negative");   
        }else{
            return (int)Math.pow(anN, aP);   
        }
    }
    
    
}
