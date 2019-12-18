package yhw;

public class Break {

	public static void main(String[] args) {
		int x=1;
		while (x<=4) {
			System.out.println("x="+x);
			if(x==3) {
				
				break;
			}
			x++;
		}
		System.out.println("");
		/////////
		outer:for (int i = 1; i<=9; i++) {
			for (int j = 1; j <=i; j++) {
				if(i>3) {
					
					break outer;
				}
				System.out.println(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println("");
		}

	}

}
