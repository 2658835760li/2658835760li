package fingergame;

import java.util.Scanner;

public class Game {
	Person player1;// 玩家1--人
	Computer player2;// 玩家2-电脑
	int count = 0;// 游戏的次数
	//难度hard胜率 40%，easy 60%
	//随机1，2，3，胜率1，2，3，

	// 进行游戏
	public void start() {
		// 选择游戏角色--确定参与游戏的玩家
		this.selectRole();
		while (true) {
			// 对战一次
			this.fight();
			//询问是否继续--退出
			// 显示结果
			this.showResult();
		}

	}

	private void showResult() {
		// TODO Auto-generated method stub
		System.out.println("一共对战  " + count + " 局");
		System.out.println(player1.getName() + "的积分：" + player1.getScore());// 复制一行ctrl+d
		System.out.println(player2.getName() + "的积分：" + player2.getScore());
	}

	private void fight() {
		// TODO Auto-generated method stub
		count++;// 局数加1
		// 对战
		int res = player1.finger() - player2.finger();
		// 结果
		if (res == 0) {
			// 平局
			System.out.println("平局");
		} else if (res == 1 || res == -2) {
			// 玩家1--胜利
			// 加分
			player1.win();
			System.out.println("玩家1--胜利");
		} else {
			// 玩家2--胜利
			player2.win();
			System.out.println("玩家2--胜利");
		}

	}

	void selectRole() {
		// 确定2个对象的name属性
		String name1;
		String name2;
		// 人类玩家的名字---输入确定
		Scanner in = new Scanner(System.in);
		System.out.println("请输入玩家名称：");
		name1 = in.next();
		// 电脑玩家的名字，1-曹操 2-刘备 3-孙权
		// 输入数字选择对战的角色名字
		int number;// 角色的编号
		System.out.println("选择对战角色：1-曹操 2-刘备 3-孙权。输入数字选择：");
		number = in.nextInt();
		switch (number) {
		case 1:
			name2 = "曹操";
			break;
		case 2:
			name2 = "刘备";
			break;
		case 3:
			name2 = "孙权";
			break;

		default:
			name2 = "无名";
			break;
		}
		player1 = new Person(name1);
		player2 = new Computer(name2);
	}

}
