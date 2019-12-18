package Jhanyis;

public class Kecheng extends Pesson{
	private  String course_id;//课程
	public  String course_name;//课程名
	private  String course_book;//参考书
	//无参数
	public Kecheng() {}
	//有参数
	public Kecheng (String mz,String you) {
		this.course_name =you;
		this.course_id=mz;	
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_book() {
		return course_book;
	}
	public void setCourse_book(String course_book) {
		this.course_book = course_book;
	}
	
	
}
