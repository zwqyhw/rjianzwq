package yhw;
class Ceshi{
	static String shcoolName;
}
public class E12 {

	public static void main(String[] args) {
		Ceshi s1=new Ceshi();
		Ceshi s2=new Ceshi();
		Ceshi.shcoolName="江汉艺术职业学院";
		System.out.println("我是"+s1.shcoolName+"的学生");
		System.out.println("我是"+s2.shcoolName+"的学生");
	}
		
}
