package com.project01.RentCalculateBound;

/**
 * 关系运算符
 * @author 12810
 *
 */

public class RelationalOperators {
	public static void main(String[] args) {
		
		int n = 3;
		int m = 4;
		System.out.println();
		System.out.println("n<m is " + (n<m));
		System.out.println("n=m is " + ((++n)==m));
		System.out.println("n>m is " + ((++n)>m));
		System.out.println("n is " + n);
		
		System.out.println();
		
		//逻辑运算符
		int a = 3;
		int b = 4;
		boolean result1 = (a>b)&&(a!=b);
		boolean result2 =(a>b)||(a!=b);
		System.out.println(result1);
		System.out.println(result2);
		
		//测试短路现象
		boolean result3 = (a<b)||((a=5)>b);
		System.out.println(result3 + ",a=" + a + ",b=" + b);
		
		//标准逻辑运算符没有短路现象
		boolean result4 = (a<b)|((a=5)>b);
		System.out.println(result4 + ",a=" + a + ",b=" + b);
		
		System.out.println();
		
		//位运算符
		int q = 3;
		int w = 4;
		System.out.println(q&w);
		System.out.println(q|w);
		System.out.println(q^w);
		System.out.println(w<<2);
		System.out.println(w>>2);
		
		}
}
