package test;

import java.util.Scanner;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ʵ�ֲ˵�
		/*
		 * -----��ӭʹ��----------
		 * 1.����ϵͳ
		 * 2.�˳�
		 * ---------------------
		 * ��������1-2ѡ���ܣ�
		 */
		/*
		 * 
		 */
		Scanner in =new Scanner(System.in);
		//��ʾ�˵�
		//�س����ͻ��з�
		//windows,
		System.out.println("-----��ӭʹ��----------\r\n"+
		  "1.����ϵͳ\r\n"+
		  "2.�˳�\r\n"+
		  "---------------------\r\n"+
		  "��������1-2ѡ���ܣ�");
		//�������֣�
		int no=in.nextInt();
		/*
		 * 
		 
		//ִ����Ӧ�Ĺ���
		if (no==1) {
			System.out.println("ִ�н���ϵͳ�Ĳ���");
			
		}else if(no==2){
			System.out.println("ִ���˳�����");
		}else {
			System.out.println("�������");
		}
		*/
		switch (no) {
		case 1:
			System.out.println("ִ�н���ϵͳ�Ĳ���");
			//�������룬���������ȷ����ʾ�˵�
			break;
		case 2:
			System.out.println("ִ���˳�����");
			break;
		default:
			System.out.println("�������");
			break;
		}

	}

}
