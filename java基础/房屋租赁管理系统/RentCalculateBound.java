package com.my.control;

import java.util.Scanner;

/**
 * 
 * @author NanZhou
 * 处理租金计算，租金计算时必须要有操作提示等图形界面
 * DOS界面设计，输入输出都在控制台
 * 
 * 输入使用Scanner对象，输出使用System对象，步骤：
 * 欢迎界面友好
 * 功能提示
 * 键盘输入数字
 * 判断输入法是否合法
 * 根据需要，定义不同数据类型的变量，并输入相应的信息
 *
 */

public class RentCalculateBound {

	public static void main(String[] args) {
		
		//欢迎界面
		System.out.println("****************************");
		System.out.println("欢迎使用房屋租赁租金计算工作！");
		System.out.println("****************************");
		
		System.out.println("选择进行操作的类型：");
		System.out.println("1.用户类型选择    2.单个用户租金计算    3.多用户租金计算    4.退出");
		System.out.println("****************************");
		
		Scanner sc = new Scanner(System.in);
		
		//获取输入的数字：整型
		int act = sc.nextInt();
		
		//判断输入的是什么数字
		boolean actResult=act==1||act==2||act==3||act==4;
		
		//条件表达式判断输入的数字的范围
		String result = actResult?"您选择的是1~4":"您的选择不在1~4内";
		System.out.println(result);
		
		//输入求租用户的姓名
		System.out.println("请输入用户名：");
		String userNameString = sc.next();
		System.out.println("求租用户姓名=" + userNameString);
		
		//输入求租用户的性别
		System.out.println("请输入求租用户性别：ture or false");
		boolean sex = sc.nextBoolean();
		System.out.println("性别="+(sex?'男':'女'));
		
		//计算租金
		System.out.println("计算租金");
		
		//租金包括三个部分：房租、物业费、其他费用
		System.out.println("请输入房屋出租费用：");
		double houseRent = sc.nextDouble();
		
		System.out.println("请输入物业费用：");
		float propertyCost = sc.nextFloat();
		
		System.out.println("请输入其他费用：");
		int otherCost = sc.nextInt();
		
		//数据类型的自动转换
		double rent = houseRent + propertyCost + otherCost;
		System.out.println("租金=" + rent);
		
	}

}
