/**
randomメソッドを使用して「サイコロの目は**です」と出力をしてください。**のところには、1 ～ 6のランダムな数字を入れます。
**/
// 数の表示とサイコロ
public class Main {
	public static void main(String[] args) {
		double rand = Math.random() * 6 + 1;
		int number = (int)rand;
		System.out.println(number);
	}
}
