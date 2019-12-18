package com.instance.java;

/**
 * 航空公司航班班期查询程序
 * @author 12810
 */

public class Flight {

	public static void main(String[] args) {
		
		//定义变量，表示班期
		byte sche = 3;
		
		String[] dateValue = {"周日","周一","周二","周三","周四","周五","周六"};
		System.out.println("航班的班期值为："+ sche + "，以下日期有航班");
		for (int i = 0; i < 7; i++) {
			if ((sche & (1 << i))!=0) {
				System.out.println(dateValue[i] + ",");
			}
		}
		System.out.println();
	}
	
}
