/**
実行するたびに、1から5までの数値をランダムに生成して、順位として表示します。ここにif文を追加して、1位の時には「おめでとう！」と表示し、それ以外の時には「あと少し！」と表示するようにしてください。

期待する出力値
あなたの順位は(1)位です
おめでとう！
-----
あなたの順位は(2..5)位です
あと少し！
**/

// if文による条件分岐
public class Main {
	public static void main(String[] args) {
		int number =(int)(Math.random() * 5 + 1);
		System.out.println("あなたの順位は" + number + "位です");
		// ここにif文を追加する
		if(number == 1) System.out.println("おめでとう！");
		else System.out.println("あと少し！");

	}
}
