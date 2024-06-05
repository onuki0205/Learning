/**
実行するたびに、100～300の数値を100刻みでランダムに生成して、ポイントとして表示するプログラムです。
またポイントが300であれば「おめでとう！」と表示するように書いていますが、エラーになってしまいます。

期待する出力値
あなたの得点は300ポイントです
おめでとう！
-----
あなたの得点は(100..200)ポイントです
**/

// if文による条件分岐
public class Main {
	public static void main(String[] args) {
		int number =((int)(Math.random() * 3 + 1)) * 100;
		System.out.println("あなたの得点は" + number + "ポイントです");
		// ここにif文を追加する
		if(number == 300) System.out.println("おめでとう！");
	}
}
