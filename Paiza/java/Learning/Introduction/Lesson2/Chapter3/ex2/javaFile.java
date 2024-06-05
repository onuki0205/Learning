/**
place の中には入賞判別したい人のレースの順位が、1〜12位までランダムな数値で代入されています。
例）5位だったら、5が代入されているものとします。

6位以上の場合は「●位入賞」と表示し、
7位以下だったら「●位入賞圏外」と表示するプログラムを書きましょう。

期待する出力値
(1 - 6)位入賞
-----
(7 - 12)位入賞圏外
**/

// if文による条件分岐　比較演算子
public class Main {
	public static void main(String[] args) {
		int place = (int)(Math.random() * 12+ 1);
		System.out.print(place + "位");
		// ここにif文を追加する
		if (place < 7) {
			System.out.println("入賞");
		} else {
			System.out.println("入賞圏外");
		}
	}
}
