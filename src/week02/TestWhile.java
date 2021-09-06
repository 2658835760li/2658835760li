package week02;

public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		//sum=1+2+3+4+   =10;
//		int i=1;
//		while(i<=10/*循环条件*/){
//			//循环体
//			sum=sum+i;
//			i++;
//		}
//		System.out.println("sum="+sum);
		//for简化了while结构
		for ( int i=1;i<=10;i++) {
			sum=sum+i;
		}
		System.out.println("sum="+sum);
		do{
			//循环体至少会执行一次
		}while(false/*循环条件*/);
//		while(false){
//			//循环体不执行
//		}

	}

}
