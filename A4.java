package com.Thread.demo;


public class A4 extends Thread{

	Test obj;
	
	A4(Test obj){
		this.obj=obj;
	}
	
	@Override
	public void run() {
		obj.method4();
		}
}
