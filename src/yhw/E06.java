package yhw;

public class E06 {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		boolean y,x;
		y=a>0&b++>1;
		System.out.println("y="+y);
		System.out.println("b="+b);
		
		x=a>0&&c++>1;
		System.out.println("x="+x);
		System.out.println("c="+c);
		
		int store=5;
		System.out.println(store<=0?"没有库存了!":(store>100?"库存太多了":"库存量为:"+store));
		
		

	}

}
