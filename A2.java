package com.Thread.demo;


public class A2 extends Thread {
	
	Test obj;
	
	A2(Test obj){
		this.obj=obj;
	}
	
	@Override
	public void run() {
		obj.method2();
		
		
	}

  }