import java.util.*;
import java.io.*;

public class Solution {
	
  public static void main(String[] args) {
	  
    Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int t = sc.nextInt(); // # testcases
    
    for(int i = 1; i <=t; i++) { //cycle thru test cases
    	
    	int numBlocks = sc.nextInt(); //# blocks in this test case
    	int totalChars = 1; //first char is A  	
    	int[] blocks = new int[numBlocks];
    	int charsAhead = 0;
    	int shift = 0;
   	
    	for(int b = 0; b < numBlocks; b++) { //add blocks to array	

			int L = sc.nextInt();
			blocks[b] = L;
			totalChars += L;
			
			if(b%2 == 0) { //b is even
				charsAhead += L;
			}
			else { //i is odd
				charsAhead -= L;
				if(charsAhead < 0) {
					shift += charsAhead * -1;
					charsAhead = 0;
				}				
			}
			
    	}
    	
    	char[] result = new char[totalChars];
    	result[0] = 'A';
    	int charPointer = 1;
    	
    	for(int b = 0; b < numBlocks; b++) {
    		int L = blocks[b];
    		if(b%2 == 0) { //b is even
    			
    			int blockPointer = 0;
    			
    			if(shift>0) {
    			
	    			while(blockPointer < L - 1) { //before shifted char
	    				result[charPointer] = (char) (result[charPointer-1] + 1);
	    				charPointer ++;
	    				blockPointer++;
	    			}
	    			
	    			if(blockPointer < L) { //if there are still chars to be set
	    				result[charPointer] = (char) (result[charPointer-1] + 1 + shift);
	    				charPointer++;
	    				blockPointer++;
	    				shift = 0;
	    			}
    			}
    			
    			else {
    				if(result[charPointer-1] > 'A') {
	    				result[charPointer] = 'A';
    				}
    				else {
    					result[charPointer] = (char) (result[charPointer-1] + 1);   					
    				}
    				charPointer++;
    				blockPointer++;
    				
    				
    				while(blockPointer<L) {
    					result[charPointer] = (char) (result[charPointer-1] +1);
    					charPointer++;
    					blockPointer++;
    				}
    			}
    			
    			//I don't think this should be possible?
//    			while(charPointer <= L) { //if there are still chars to be set after the shift
//    				result[charPointer] = (char) (result[charPointer-1] + 1);
//    				charPointer++;
//    			}
	
    		}
    		else { //b is odd
    			
    			int blockPointer = 0;
    			char startingChar = 'B';
    			
    			
    			if(b==numBlocks-1) {
    				startingChar = 'A';
    				
    			}
    			
//    			if(shift>0) { 
//    				result[charPointer] = (char) (result[charPointer-1] - 1 + shift);
//    				charPointer++;
//    				blockPointer++;
//    				shift = 0;
//    			}
    			
    			result[charPointer] = (char) (startingChar + L - 1);
    			charPointer++;
    			blockPointer++;
    			
    			while(blockPointer < L) {
    				result[charPointer] = (char) (result[charPointer-1] -1);
    				charPointer++;
    				blockPointer++;
    			}
    			    			
    		}
    	}
    	
    	System.out.print("Case #" + i + ": "); 
    	for(char r: result) {
    		System.out.print(r);
    	}
    	System.out.println();
    	
    }
  }
}



  