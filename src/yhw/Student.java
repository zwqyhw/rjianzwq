package yhw;

public class Student {
	public static int f(int n) {
		if(n==1) {
		return 0;
		}
		if(n==2) {
			return 1;
			}
	return f(n-1)+f(n-2);

	}
	public static void main(String[] args) {
		System.out.println("裴波那契的第六个元素值是:"+f(6));

	}

}
