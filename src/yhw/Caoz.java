package yhw;


class Caoz {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		System.out.println("后加,表达式i++:"+(i++));
		System.out.println("先加,表达式++j:"+(++j));
		System.out.println("不管先加还是后加都是:"+i);
		System.out.println("不管先加还是后加都是:"+j);
		//
		int a=2; 
		a+=3;
		System.out.println(a);
		//
		String s1="nihao";
		String s2="nihao";
		System.out.println(s1==s2);
		//
		E02 E1=new E02();
		E02 E2=new E02();
		System.out.println(E1==E2);
		
		
		

	}

}
