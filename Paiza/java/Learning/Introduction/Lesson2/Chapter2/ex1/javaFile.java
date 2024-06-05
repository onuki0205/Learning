/**
実行するたびに、1から5までの数値をランダムに生成して、順位として表示します。ここにif文を追加して、次のように表示するようにしてください。

- 1位の時　「おめでとう！」と表示する
- 2位の時　「あと少し！」と表示する
- その他の時「よくがんばったね」と表示する

期待する出力値
あなたの順位は(1)位です
おめでとう！
-----
あなたの順位は(2)位です
あと少し！
-----
あなたの順位は(3..5)位です
よくがんばったね
**/

// if文による条件分岐　else if
public class Main {
	public static void main(String[] args) {
		int number = (int)(Math.random() * 5 + 1);
		System.out.println("あなたの順位は" + number + "位です");
		// ここにif文を追加する
		if(number == 1) System.out.println("おめでとう！");
		else if (number == 2) System.out.println("あと少し！");
		else System.out.println("よくがんばったね");
	}
}
