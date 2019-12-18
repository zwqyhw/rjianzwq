package yhw;

import javax.print.attribute.standard.RequestingUserName;

public class Digui {
	public static int getSum(int n) {
	if (n==0) {
	return 1;
}
	int temp=getSum(n-1);
	return temp+n;
	
}
	public static void main(String[] args) {
	int sum=getSum(4);
	System.out.println("1到4的和是:"+sum);
}
}
