package com.instance.java;

import java.util.Scanner;

/**
 * �����¶��뻪���¶ȵ�ת��
 * @author 12810
 *
 */

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		
		// Ҫ��֤��������ֺ͵�λ�пո�
		System.out.println("�������¶�ֵ��n C|F��:");
		
		System.out.println("���磺22 C");

		
		Scanner sca = new Scanner(System.in);
		int d = sca.nextInt();
		char c = sca.next().trim().charAt(0);
		
		if (c == 'c'||c == 'C') {
			double f_temp = 9 * d / 5.0 + 32;
			//��doubleֵ��������
			int f_temp_int = (int)(f_temp + 0.5);
			System.out.println("��������¶�ֵ�ǣ�" + d + " " + "C");
			System.out.println("ת������¶�ֵ�ǣ�" + f_temp_int + " " + "F");	
		}else if (c == 'f'||c =='F') {
			double c_temp = 5 * (d - 32) / 9.0;
			//��doubleֵ��������
			int c_temp_int = (int)(c_temp + 0.5);
			System.out.println("��������¶�ֵ�ǣ�" + d + " " + "F");
			System.out.println("ת������¶�ֵ�ǣ�" + c_temp_int + " " + "C");
		}else {
			System.out.println("��������¶ȵ�λ����ȷ���¶ȵ�λ����Ϊ��C����F��");
		}

	}

}
