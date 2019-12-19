package com.project01.RentCalculateBound;

/**
 * 变量和常量的使用
 * @author 12810
 *
 */

public class Variable {
	
	//声明常量PI，如果不赋值会出现错误
	static final double PI = 3.14;
	//定义int型成员变量，并赋值
	static int member = 23;
		
	public static void main(String[] args) {
		//声明int型的常量
		final int part;
		//对常量进行赋值
		part = 123;
		//再次对成员变量进行赋值
		member = 24;
		
	}
}
