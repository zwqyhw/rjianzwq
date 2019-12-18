package yhw;

public class E08 {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i < 100; i+=2) {
			
			 sum+=i;
		}
		 System.out.println("100以內的奇數是:"+sum);
		 
		sum=0;
		int i=2;
		while (i<=100) {
			sum+=i;
			i+=2;
			
		}
		System.out.println("100以內的偶數是:"+sum);
		

	}

}
