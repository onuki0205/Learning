/**
実行するたびに、1から3までの数値を
ランダムに生成して、順位として表示します。ここにif文を追加して、
1位の時には「おめでとう！」と表示するようにしてください。

期待する出力値
あなたの順位は1位です
おめでとう！
**/

// if文による条件分岐
public class Main {
	public static void main(String[] args) {
		int number =(int)(Math.random() * 3 + 1);
		System.out.println("あなたの順位は" + number + "位です");
		// ここにif文を追加する
		if(number == 1) System.out.println("おめでとう！");

	}
}
