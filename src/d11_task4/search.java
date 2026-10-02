package d11_task4;

public class search {

	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		int search = 30;
		for(int i = 0; i<num.length; i++) {
			if (search == num[i]) {
				System.out.println(num[i] +" is found in index " + i);
			    break;
				
			}
		}

	}

}
