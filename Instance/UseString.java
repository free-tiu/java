package com.instance.java;

/**
 * ��������String��ĳ��÷���
 * @author 12810
 *
 */

public class UseString {

	public static void main(String[] args) {

		String s1 = "hello,hehe,haha,oaoa,yoxiyoxi";
		String s2 = "  To  day  ";
		String s3 = "So";
		
		//ȥ��s2�ַ������˵Ŀհ�
		System.out.println(s2.trim());
		
		//��ȡs3�ַ�����s1�ַ����е�����λ��
		System.out.println(s1.indexOf(s3));
		
		//��ȡ����Ϊ1��λ���ϵ��ַ�
		System.out.println(s1.charAt(1));
		
		//�ж������ַ����������Ƿ����
		System.out.println(s3.equals("So"));
		System.out.println(s3.equalsIgnoreCase("so"));
		
		//��ȡs1�ַ����е��Ӵ���������Ϊ6��λ�ÿ�ʼ
		System.out.println(s1.substring(6));
		
		//��ȡs1�ַ�������ʼλ��Ϊ6������λ��Ϊ10���Ӵ�
		//������ʼλ�ö�Ӧ���ַ�������������λ�ö�Ӧ���ַ�
		System.out.println(s1.substring(6,10));
		
		//��","Ϊ�ָ��������ַ�����ֳ��ַ�����
		String[] ss = s1.split(",");
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]+" ");
		
		}
		
	}

}
