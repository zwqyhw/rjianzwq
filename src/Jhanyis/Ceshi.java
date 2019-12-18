package Jhanyis;


public class Ceshi {


	public static void main(String[] args) {
		
	Xuesheng s1=new Xuesheng();
		s1.setName("mike");
		s1.setAge(600);
		Xuesheng s2=new Xuesheng(590,"serend");
		System.out.println(s1.getName()+"考了"+s1.getAge()+"分");
		System.out.println(s2.getName()+"考了"+s2.getAge()+"分");
		
		Kecheng c1=new Kecheng();
		c1.setCourse_name("java程序设计");
		c1.setCourse_book("java基础入门");
		System.out.println(c1.getCourse_name()+"这门课程使用的的教材是《"+c1.getCourse_book()+"》");
		

	}

	}


