package yhw;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Overlook {

		public static int add(int x,int y) {
			return x+y;
		}
		public static int add(int x,int y,int z) {
			return x+y+z;
		}		
		public static double add(double x,double y) {
			return x+y;
		}
		public static void main(String[] args) {

		//在静态方法里，只能调用本类的静态方法，不能调用非静态方法
		int sum1=add(3,2);
		int sum2=add(3,2,1);
		double sum3=add(0.5,0.4);
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
	    System.out.println("sum3="+sum3);
		}
		}


