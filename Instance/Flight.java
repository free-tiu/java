package com.instance.java;

/**
 * ���չ�˾������ڲ�ѯ����
 * @author 12810
 */

public class Flight {

	public static void main(String[] args) {
		
		//�����������ʾ����
		byte sche = 3;
		
		String[] dateValue = {"����","��һ","�ܶ�","����","����","����","����"};
		System.out.println("����İ���ֵΪ��"+ sche + "�����������к���");
		for (int i = 0; i < 7; i++) {
			if ((sche & (1 << i))!=0) {
				System.out.println(dateValue[i] + ",");
			}
		}
		System.out.println();
	}
	
}
