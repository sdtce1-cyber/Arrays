package d11_task1;

public class Mark {

		public static void main(String[] args) {
			int[] mark = {56,45,34,56,67,78,65,78,77,90};
			int highestMark=mark[0];
            int lowestMark=mark[0];
            int total=0;
            int average = 0;
            int passCount=0;
            int failCount=0;
            for(int i=0; i<mark.length; i++) {	
            if(mark[i] > highestMark) {
            	highestMark = mark[i];
            }
            if(mark[i] < lowestMark) {
            	lowestMark = mark[i];
            }
            total = total+mark[i];
            average = total/10;
            
            
            if(mark[i]>= 50) {
            	passCount++;
            }
            if(mark[i] <=50) {
            	failCount++;
            }
            }
            System.out.println("Highest mark is "+ highestMark);
            System.out.println("Lowest mark is "+ lowestMark); 
            System.out.println("Average mark is "+ average);
            System.out.println("Total Pass count is "+ passCount);
            System.out.println("Total Fail count is "+ failCount);
}}