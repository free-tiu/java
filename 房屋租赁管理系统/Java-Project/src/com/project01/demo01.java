package com.project01;

public class demo01 {
	public static void main(String[] args) {
		
		//分别把十进制、八进制和十六进制赋值给int和long型变量，并输出这些变量的十进制值
		int a = 56;
		int b = 073;
		long c = 0xa38f;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		System.out.println("   ");
		System.out.println("*********分割线*********");
		System.out.println("   ");
		
		//计算长方形的面积
		double a1 = 3.0,b1 = 4.0;
		double area = a1*b1;
		System.out.println("长为3，宽为4的长方形的面积为"+area);
		
		System.out.println("   ");
		System.out.println("*********分割线*********");
		System.out.println("   ");
		
		//布尔类型的使用
		boolean flag = true;
		if (flag) {
			System.out.println("条件为真");
		}else {
			System.out.println("条件为假");
		}
		
				
	}
}
