package yhw;
 /*
  * 紫色的代码是关键字:package:包public:修饰符共有的;class类staic:修饰符,静态的,void：空的表明该方法没有反回值
  * 
 */
public class yyy {

	public static void main(String[] args) {
		byte a=1;
		short b=1;
		int c=1;
		long d=1;
		float f=1.0f;
		double s=1.0;
		
		char h='a';
		char ch=97;
		
		boolean flag=false;
		
		System.out.println(flag);
		
		System.out.println(h);
		System.out.println(ch);
		
		System.out.println("字节型整数数据长度是"+Byte.SIZE);
		System.out.println("短整型整数数据长度是"+Short.SIZE);
		System.out.println("整型整数数据长度是"+Integer.SIZE);
		System.out.println("长整型整数数据长度是"+Long.SIZE);
		
		
		System.out.println("单精度字符数数据长度是"+Float.SIZE);
		System.out.println("双精度字符数数据长度是"+Double.SIZE);
		
		
		System.out.println("字节型整数数据长度是"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
		System.out.println("短整型整数数据长度是"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
		System.out.println("整型整数数据长度是"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
		System.out.println("长整型整数数据长度是"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
		
		
		System.out.println("单精度字符数数据长度是"+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
		System.out.println("双精度字符数数据长度是"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);

		System.out.println("字符类数据长度是"+(int)Character.MIN_VALUE+"-"+(int)Character.MAX_VALUE);
	
		System.out.println("布尔数据长度是"+Boolean.TRUE+"-"+Boolean.FALSE);
	}
	
	

}
