package week02;

import java.util.Scanner;

public class Login {

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
			//�����û��������룬
			String password;//����
			String username;//�û���
			System.out.println("�������û�����");
			username=in.next();
			System.out.println("���������룺");
			password=in.next();//�����ַ���
			
			//����û���=admin����=1234����ʾ�˵�������ȷ����ʾ�����벻�ԡ�
			if (username.equals("admin")&&password.equals("1234") ) {
				System.out.println("������ȷ����ʾ���ܲ˵�");
			}else {
				System.out.println("�û������벻ƥ��");
				//�ظ�����һ��
				System.out.println("�������û�����");
				username=in.next();
				System.out.println("���������룺");
				password=in.next();//�����ַ���
				if (username.equals("admin")&&password.equals("1234") ) {
					System.out.println("������ȷ����ʾ���ܲ˵�");
				}else {
					System.out.println("�û������벻ƥ��");
					//�ظ�2��
					System.out.println("�������û�����");
					username=in.next();
					System.out.println("���������룺");
					password=in.next();//�����ַ���
					if (username.equals("admin")&&password.equals("1234") ) {
						System.out.println("������ȷ����ʾ���ܲ˵�");
					}else {
						System.out.println("�û������벻ƥ��");
					}
				}
			}
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
