package com.ariveguru.git;

public class SampleTest {
	private int sno;
	private String sname;
	static{
		System.out.println("Welcome to GIT World..");
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public SampleTest() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor...");
	}
	static void method(){
		System.out.println("some another changes...");
	}
}
