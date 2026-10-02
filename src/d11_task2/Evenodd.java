package d11_task2;

public class Evenodd {

	public static void main(String[] args) {
		int[] num = new int[15];
		num[0]=10;
		num[1]=20;
		num[2]=56;
		num[3]=16;
		num[4]=14;
		num[5]=75;
		num[6]=67;
		num[7]=22;
		num[8]=33;
		num[9]=37;
		num[10]=17;
		num[11]=17;
		num[12]=19;
		num[13]=57;
		num[14]=55;
		
		for(int i=0;i<num.length; i++) {
			if (num[i]%2 ==0) {
				System.out.println(num[i] + " is even");
			} else {
				System.out.println(num[i] + " is odd");
			}
		}

	}
}