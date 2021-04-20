import java.util.*;
import java.io.*;

public class Solution {
	
  public static void main(String[] args) {
	  
    Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int t = sc.nextInt(); // # testcases
    
    for(int i = 1; i <=t; i++) { //cycle thru test cases
    	int numPets = sc.nextInt();
    	
    	int[] petArray = new int[numPets];
   	
    	for(int n = 0; n < numPets; n++) { //add pets in this test case to an array    		
    		int size = sc.nextInt();
    		petArray[n] = size;
    	}
    	
    	int numTreats = 1;
    	
    	Arrays.sort(petArray); //sort in ascending order
    	
    	//first element:
    	int totalTreats = 1;
    	int prevSize = petArray[0];
    	
    	//subsequent elements:
    	for(int p = 1; p < numPets; p++) { //for each pet in the sorted array after the first one
    		
    		if(petArray[p] > prevSize) {
    			numTreats++;
    		}
    		
    		totalTreats += numTreats;
    	}
    	
    	
    	System.out.println("Case #" + i + ": " + totalTreats);  	
    	
    }
  }
}