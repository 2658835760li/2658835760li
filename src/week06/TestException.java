package week06;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ��������
 * 
 * ������/����=��...����
 * 
 * ����int
 * 
 * �������1--if
 * // if (in.hasNextInt()) {
 //
 // }
 * 
 //		if (number2==0) {
 //			System.out.println("��������Ϊ0");
 //		}else {
 //			System.out.println(number1+"/"+number2+"="+number1/number2);
 //		}
 */

class MyException extends Exception{
	public MyException(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
}
public class TestException {
	//�׳��쳣
	public static void divid()throws ArithmeticException,InputMismatchException,Exception {
		Scanner in = new Scanner(System.in);

		System.out.println("�����뱻������");

		int number1 = in.nextInt();
		System.out.println("�����������");
		int number2 = in.nextInt();
		System.out.println(number1 + "/" + number2 + "=" + number1 / number2);// ���ܻ����쳣
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("�����뱻������");

			int number1 = in.nextInt();
			System.out.println("�����������");
			int number2 = in.nextInt();
			System.out.println(number1 + "/" + number2 + "=" + number1
					/ number2);// ���ܻ����쳣
		} catch (ArithmeticException e) {
			// �쳣����
			System.out.println("��������Ϊ0");
		} catch (InputMismatchException e1) {
			// TODO: handle exception
			// �쳣����
			System.out.println("������������");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�������");
		}
 */
		try {
			divid();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//����
		System.out.println("����ִ����������");
		System.out.println("�������");

	}

}
