/**
スライムの体重は、すべて体重100キロです。そして、「体重100キロのスライムが、X匹あらわれた。」と表示します。
そこで、スライムの合計体重を計算して、「スライムの合計体重は、Yキロです。」と表示してください。

期待する出力値
体重100キロのスライムが、X匹あらわれた。
スライムの合計体重は、Yキロです。

ただし、Xは、1 ～ 10の整数です。
**/
public class Main {
	public static void main(String[] args) {
		int number =(int)(Math.random() * 10 + 1);	// 匹数 1 ～ 10
		System.out.println("体重100キロのスライムが、" + number + "匹あらわれた。");
		// 合計体重 =匹数 × 100
		int weight = 100 * number;
		System.out.println("スライムの合計体重は、" + weight + "キロです。");

	}
}
