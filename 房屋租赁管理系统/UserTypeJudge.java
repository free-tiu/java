package com.my.control;

import java.util.Scanner;

/**
 * �û�����ѡ��
 * 
 * ����������ʾ
 * ������Ӧ�ַ�
 * ���ʹ��if-else�ṹ�����û����͵�ѡ��
 * ���ʹ��switch�ṹ�����û�����ѡ��
 * �ֱ����
 * @author 12810
 *
 */

public class UserTypeJudge {
	
	public void ifJudgeUserType(char c) {
		
		// ʹ��if-else�ж��û�����
		if (c == 'a') {
			System.out.println("��ѡ����ǳ����û���");
		}else if (c == 'b') {
			System.out.println("��ѡ����������û���");
		}else if (c == 'c') {
			System.out.println("��ѡ�������ͨԱ����");
		}else if (c == 'd') {
			System.out.println("��ѡ�����ϵͳ����Ա��");
		}else {
			System.out.println("���������������������룡");
		}
	}
	
	
	public void switchJudgeUserType(int c) {
		switch (c) {
		case 1:
			System.out.println("��ѡ����ǳ����û���");
			break;
		case 2:
			System.out.println("��ѡ����������û���");
			break;
		case 3:
			System.out.println("��ѡ�������ͨԱ����");
			break;
		case 4:
			System.out.println("��ѡ�����ϵͳ����Ա��");
			break;
		default:
			System.out.println("���������������������룡");
		}
	}
	
	public static void main(String[] args) {
		// ����UserTypeJudge����
		UserTypeJudge userType = new UserTypeJudge();
		
		//�������������
		Scanner sc = new Scanner(System.in);
		
		//1.ʹ��if-else�ж��û�����
		System.out.println("ʹ��if-else�жϣ��ж����ͣ��ַ�");
		System.out.println("������ѡ����û����ͣ�a:�����û�		b:�����û�");
		System.out.println("			c:��ͨԱ��	d:ϵͳ����Ա");
		
		//�ӿ���̨����һ���ַ��������ַ����л�ȡ�ַ�
		String str = sc.next();
		char c = str.charAt(0);
		userType.ifJudgeUserType(c);
		System.out.println("---------------------");
		
		//2.ʹ��switch�ж��û�����
		System.out.println("������ѡ����û����ͣ�1:�����û�		2:�����û�");
		System.out.println("			3:��ͨԱ��		4:ϵͳ����Ա");
		System.out.println("ʹ��switch�ж��û�����,�ж����ͣ�����");
		System.out.println("������ѡ����û����ͣ�");
		int i = sc.nextInt();
		userType.switchJudgeUserType(i);

	}

}
