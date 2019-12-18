package yhw;

public class T6 {
	public static void main(String[] args) {
	Overlook o1=new Overlook();
	//在静态方法里，只能调用本类的静态方法，不能调用非静态方法
	int sum1=Overlook.add(3,2);
	int sum2=Overlook.add(3,2,1);
	double sum3=Overlook.add(0.5,0.4);
	System.out.println("sum1="+sum1);
	System.out.println("sum2="+sum2);
    System.out.println("sum3="+sum3);
	}
}
