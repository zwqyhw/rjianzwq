package yhw;

public class Shuzhu {

	public static void main(String[] args) {
		int arr[]={9,8,5,3,2};
		System.out.println("數組的長度是:"+arr.length);
		for (int szys:arr) {
			System.out.print(szys+" ");
		}
		System.out.println();
			for (int m =1; m < arr.length; m++) {
				
				for (int n = 0; n < arr.length-m; n++) {
					if (arr[n] >arr[n+1]) {
						int temp=arr[n];
						arr[n]=arr[n+1];
						arr[n+1]=temp;
					}

			}
		}
			for (int szys:arr) {
				System.out.print(szys+" ");
			}
	}

}
