/**
age変数の中には、飲酒可能か判定する人の年齢が、18〜22才までランダムに数値が代入されています。
例）19才だったら、19が代入されているとします。

20才未満の場合は「○才は飲酒不可」と表示し
20才以上だったら「○才は飲酒可能」と表示するプログラムを書きましょう。

期待する出力値
(18, 19)才は飲酒不可
-----
(20, 21, 22)才は飲酒可能
**/

// if文による条件分岐　比較演算子
public class Main {
	public static void main(String[] args) {
		int age = (int)(Math.random() * 5 + 18);
		System.out.print(age + "才は");
		// ここにif文を追加する
		if(age < 20) System.out.println("飲酒不可");
		else System.out.println("飲酒可能");

	}
}
