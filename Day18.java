import java.io.*;
import java.util.*;

public class Day18{
    // Write your code here.
    Queue<Character> queue = new LinkedList<Character>();
    Deque<Character> stack = new ArrayDeque<Character>();
    void pushCharacter(char ch){
        //push character onto stack
        stack.push(ch);
        //System.out.println("output of pushCharacter: " + stack.pop());
    }
    
    void enqueueCharacter(char ch){
        //enqueue onto queue
        queue.add(ch);
        //System.out.println("peek: " + queue.peek());
    }
    char popCharacter(){
        //pop from stack
        return stack.pop();
    }
    char dequeueCharacter(){
        //dequeue from queue
        return queue.remove();
    }
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}