package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Main1009 {
 
    public static void main(String[] args) throws IOException {
 
    	String NAME;
    	double FIXED_SALARY, TOTAL_SALES, SALARY;
    	
    	Scanner s = new Scanner(System.in);
    	
    	NAME = s.next();
    	FIXED_SALARY = s.nextDouble();
    	TOTAL_SALES = s.nextDouble();
    	
    	SALARY = FIXED_SALARY+(TOTAL_SALES*0.15);
    	
    	System.out.printf("TOTAL = R$ %.2f%n",SALARY);
 
    }
 
}