package com.instance.java;

/**
 * 用来测试String类的常用方法
 * @author 12810
 *
 */

public class UseString {

	public static void main(String[] args) {

		String s1 = "hello,hehe,haha,oaoa,yoxiyoxi";
		String s2 = "  To  day  ";
		String s3 = "So";
		
		//去掉s2字符串两端的空白
		System.out.println(s2.trim());
		
		//获取s3字符串在s1字符串中的索引位置
		System.out.println(s1.indexOf(s3));
		
		//获取索引为1的位置上的字符
		System.out.println(s1.charAt(1));
		
		//判断两个字符串的内容是否相等
		System.out.println(s3.equals("So"));
		System.out.println(s3.equalsIgnoreCase("so"));
		
		//截取s1字符串中的子串，从索引为6的位置开始
		System.out.println(s1.substring(6));
		
		//截取s1字符串中起始位置为6，结束位置为10的子串
		//包含起始位置对应的字符，不包含结束位置对应的字符
		System.out.println(s1.substring(6,10));
		
		//以","为分隔符，将字符串拆分成字符数组
		String[] ss = s1.split(",");
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]+" ");
		
		}
		
	}

}
