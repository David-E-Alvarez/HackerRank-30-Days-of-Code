import java.io.*;
import java.util.*;

//Write your code here
class Day19Calculator implements AdvancedArithmetic{
    /*Calculator(){
        System.out.println("Calculator");
    }*/
    public int divisorSum(int n){
        int runningSum = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                runningSum += i;
            }
        }
        return runningSum;
    }
}