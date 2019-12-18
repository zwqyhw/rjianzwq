package yhw;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test {

	public Test() {
		System.out.println("构造方法一被调用");
	}
	public Test(int x) {
		this();
		System.out.println("构造方法二被调用");
	}
	public Test(Boolean b) {
		this(1);
		System.out.println("构造方法三被调用");
	}
	public static void main(String[] args) {
		Test test=new Test(true);

	}

}
