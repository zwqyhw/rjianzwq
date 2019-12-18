package Jhanyis;

public class Teachar {
	private String name;
	private String id;
	private int age;
	//无参
	public Teachar() {
		super();
		// TODO 自动生成的构造函数存根
	}
	//有参
	public Teachar(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
