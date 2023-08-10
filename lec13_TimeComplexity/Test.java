package lec13_TimeComplexity;

public class Test {

	 public static void main(String[] args) {
	        int N = 4;
	        int totalRows = 2 * N - 1;
	        
	        int currentRow = 1;
	        while (currentRow <= totalRows) {
	            int currentColumn = 1;
	            
	            while (currentColumn <= totalRows) {
	                int distance = Math.abs(N - currentRow) + 1;
	                int num = N - distance + 1;
	                
	                if (currentColumn >= distance && currentColumn <= totalRows + 1 - distance) {
	                    System.out.print(num);
	                } else {
	                    System.out.print(" ");
	                }
	                
	                currentColumn++;
	            }
	            
	            System.out.println();
	            currentRow++;
	        }
	    }
}
