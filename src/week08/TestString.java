package week08;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʼ��
		String name="tom";
		String name2=new String("jerry");
		//���ַ���,����һ���ַ������������ַ����ַ���
		String name3=null;
		String name4="";//���ַ���
		//�жϿ��ַ���
		if (name4.equals("")) {
			System.out.println("�ǿ��ַ���");
		}else {
			System.out.println("���ǿ��ַ���");
		}
		if (name4.isEmpty()) {
			System.out.println("�ǿ��ַ���");
		}else {
			System.out.println("���ǿ��ַ���");
		}
		//�ж��ļ��ǲ���txt�ļ�
		String fileName="d:\\doc\\abc.txt";//�ַ�����\��ת���ַ���\t,\r\n,��Ҫʹ��\���ţ���\\��ʾ\
		if (fileName.endsWith(".txt")) {
			System.out.println("���ı��ļ�");
			//����ַ������ļ�����·����
			String []names=fileName.split("\\\\");
			for(int i=0;i<name.length();i++){
				System.out.println(names[i]);
			}
			
			
		}else {
			System.out.println("�����ı��ļ�");
		}
		

	}

}
