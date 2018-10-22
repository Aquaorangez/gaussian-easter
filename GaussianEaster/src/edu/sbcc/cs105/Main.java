/**
 * @author Mick Campitelli
 */
package edu.sbcc.cs105;
 
import java.util.*;

 
/**
 * This class tests the GaussianEaster object.
 *
 */
public class Main {
 
    /**
     * Creates and tests Gaussian Easter object. 
     */
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	System.out.print("Input Easter year: ");
    	int year = s.nextInt();
    	GaussianEaster demo = new GaussianEaster(year);
    	
    	System.out.printf("Year: %d Month: %d Day: %d", year, demo.getN(), demo.getP());
    	s.close();
    }
}