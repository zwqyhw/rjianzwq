package com.class_;
interface Animal{
	void shout();
}
class Tiger implements Animal{
	@Override
	public void shout() {
		System.out.println("hanghang");
	}
	public void setMan() {
		System.out.println("发出猪叫");
	}
}
public class E08 {

	public static void main(String[] args) {
		Animal an1=new Tiger();
		if(an1 instanceof Tiger) {
		Tiger Tiger=(Tiger) an1;
		Tiger.shout();
		Tiger.setMan();
		}else {
			System.out.println("宝强是猪");
		}
	}

}
