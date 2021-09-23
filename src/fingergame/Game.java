package fingergame;

import java.util.Scanner;

public class Game {
	Person player1;// ���1--��
	Computer player2;// ���2-����
	int count = 0;// ��Ϸ�Ĵ���
	//�Ѷ�hardʤ�� 40%��easy 60%
	//���1��2��3��ʤ��1��2��3��

	// ������Ϸ
	public void start() {
		// ѡ����Ϸ��ɫ--ȷ��������Ϸ�����
		this.selectRole();
		while (true) {
			// ��սһ��
			this.fight();
			//ѯ���Ƿ����--�˳�
			// ��ʾ���
			this.showResult();
		}

	}

	private void showResult() {
		// TODO Auto-generated method stub
		System.out.println("һ����ս  " + count + " ��");
		System.out.println(player1.getName() + "�Ļ��֣�" + player1.getScore());// ����һ��ctrl+d
		System.out.println(player2.getName() + "�Ļ��֣�" + player2.getScore());
	}

	private void fight() {
		// TODO Auto-generated method stub
		count++;// ������1
		// ��ս
		int res = player1.finger() - player2.finger();
		// ���
		if (res == 0) {
			// ƽ��
			System.out.println("ƽ��");
		} else if (res == 1 || res == -2) {
			// ���1--ʤ��
			// �ӷ�
			player1.win();
			System.out.println("���1--ʤ��");
		} else {
			// ���2--ʤ��
			player2.win();
			System.out.println("���2--ʤ��");
		}

	}

	void selectRole() {
		// ȷ��2�������name����
		String name1;
		String name2;
		// ������ҵ�����---����ȷ��
		Scanner in = new Scanner(System.in);
		System.out.println("������������ƣ�");
		name1 = in.next();
		// ������ҵ����֣�1-�ܲ� 2-���� 3-��Ȩ
		// ��������ѡ���ս�Ľ�ɫ����
		int number;// ��ɫ�ı��
		System.out.println("ѡ���ս��ɫ��1-�ܲ� 2-���� 3-��Ȩ����������ѡ��");
		number = in.nextInt();
		switch (number) {
		case 1:
			name2 = "�ܲ�";
			break;
		case 2:
			name2 = "����";
			break;
		case 3:
			name2 = "��Ȩ";
			break;

		default:
			name2 = "����";
			break;
		}
		player1 = new Person(name1);
		player2 = new Computer(name2);
	}

}
