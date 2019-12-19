package com.my.control;

import java.util.Scanner;

/**
 * 用户类型选择
 * 
 * 界面输入提示
 * 输入相应字符
 * 设计使用if-else结构进行用户类型的选择
 * 设计使用switch结构进行用户类型选择
 * 分别调用
 * @author 12810
 *
 */

public class UserTypeJudge {
	
	public void ifJudgeUserType(char c) {
		
		// 使用if-else判断用户类型
		if (c == 'a') {
			System.out.println("您选择的是出租用户！");
		}else if (c == 'b') {
			System.out.println("您选择的是求租用户！");
		}else if (c == 'c') {
			System.out.println("您选择的是普通员工！");
		}else if (c == 'd') {
			System.out.println("您选择的是系统管理员！");
		}else {
			System.out.println("您的输入有误，请重新输入！");
		}
	}
	
	
	public void switchJudgeUserType(int c) {
		switch (c) {
		case 1:
			System.out.println("您选择的是出租用户！");
			break;
		case 2:
			System.out.println("您选择的是求租用户！");
			break;
		case 3:
			System.out.println("您选择的是普通员工！");
			break;
		case 4:
			System.out.println("您选择的是系统管理员！");
			break;
		default:
			System.out.println("您的输入有误，请重新输入！");
		}
	}
	
	public static void main(String[] args) {
		// 创建UserTypeJudge对象
		UserTypeJudge userType = new UserTypeJudge();
		
		//获得输入流对象
		Scanner sc = new Scanner(System.in);
		
		//1.使用if-else判断用户类型
		System.out.println("使用if-else判断，判断类型：字符");
		System.out.println("请输入选择的用户类型：a:出租用户		b:求租用户");
		System.out.println("			c:普通员工	d:系统管理员");
		
		//从控制台输入一个字符串，从字符串中获取字符
		String str = sc.next();
		char c = str.charAt(0);
		userType.ifJudgeUserType(c);
		System.out.println("---------------------");
		
		//2.使用switch判断用户类型
		System.out.println("请输入选择的用户类型：1:出租用户		2:求租用户");
		System.out.println("			3:普通员工		4:系统管理员");
		System.out.println("使用switch判断用户类型,判断类型：整型");
		System.out.println("请输入选择的用户类型：");
		int i = sc.nextInt();
		userType.switchJudgeUserType(i);

	}

}
