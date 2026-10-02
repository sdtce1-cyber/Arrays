package d11_task5;

public class Salary {

	public static void main(String[] args) {
		int[] salary = {50000,45000,23550,78654,67543,
				87654,34565,56423,98675,34567};
		int highest = salary[0];
		int lowest = salary[0];
		int total = 0;
		int count = 0;
		int average = 0;
		for (int i=0; i<salary.length; i++) {
			if(salary[i] > highest) {
				highest = salary[i];
			} 
			
			if(salary[i] < lowest) {
				lowest = salary[i];
			}
			
			total = total+salary[i];
			average = total/10;
			
			if(salary[i] >= 50000) {
				count++;
			}
		}
		System.out.println("highest salary is "+ highest);
		System.out.println("Lowest salary is "+ lowest);
		System.out.println("Average salary is "+ average);
		System.out.println("Total number of emp with above 50000 is "+ count);
	}
	
}
