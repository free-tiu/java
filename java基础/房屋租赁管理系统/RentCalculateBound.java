package com.my.control;

import java.util.Scanner;

/**
 * 
 * @author NanZhou
 * ���������㣬������ʱ����Ҫ�в�����ʾ��ͼ�ν���
 * DOS������ƣ�����������ڿ���̨
 * 
 * ����ʹ��Scanner�������ʹ��System���󣬲��裺
 * ��ӭ�����Ѻ�
 * ������ʾ
 * ������������
 * �ж����뷨�Ƿ�Ϸ�
 * ������Ҫ�����岻ͬ�������͵ı�������������Ӧ����Ϣ
 *
 */

public class RentCalculateBound {

	public static void main(String[] args) {
		
		//��ӭ����
		System.out.println("****************************");
		System.out.println("��ӭʹ�÷������������㹤����");
		System.out.println("****************************");
		
		System.out.println("ѡ����в��������ͣ�");
		System.out.println("1.�û�����ѡ��    2.�����û�������    3.���û�������    4.�˳�");
		System.out.println("****************************");
		
		Scanner sc = new Scanner(System.in);
		
		//��ȡ��������֣�����
		int act = sc.nextInt();
		
		//�ж��������ʲô����
		boolean actResult=act==1||act==2||act==3||act==4;
		
		//�������ʽ�ж���������ֵķ�Χ
		String result = actResult?"��ѡ�����1~4":"����ѡ����1~4��";
		System.out.println(result);
		
		//���������û�������
		System.out.println("�������û�����");
		String userNameString = sc.next();
		System.out.println("�����û�����=" + userNameString);
		
		//���������û����Ա�
		System.out.println("�����������û��Ա�ture or false");
		boolean sex = sc.nextBoolean();
		System.out.println("�Ա�="+(sex?'��':'Ů'));
		
		//�������
		System.out.println("�������");
		
		//�������������֣����⡢��ҵ�ѡ���������
		System.out.println("�����뷿�ݳ�����ã�");
		double houseRent = sc.nextDouble();
		
		System.out.println("��������ҵ���ã�");
		float propertyCost = sc.nextFloat();
		
		System.out.println("�������������ã�");
		int otherCost = sc.nextInt();
		
		//�������͵��Զ�ת��
		double rent = houseRent + propertyCost + otherCost;
		System.out.println("���=" + rent);
		
	}

}
