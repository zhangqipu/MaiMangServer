package com.zhangqipu.MaiM.Beans;

public class User extends BaseBean {
	
	private String userName;
	private int	   age;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
