/**
「大吉」か「大凶」を出力する、次のようなおみくじプログラムを作成してください。

- omikuji変数には、1から100までの値がランダムに代入されます。
- omikuji変数の値が30から100の場合は、「omikujiの中身は○○なので大吉」と表示
- omikuji変数の値が29以下の場合は、「omikujiの中身は○○なので大凶」と表示

例1: omikujiの中身は32なので大吉
例2: omikujiの中身は12なので大凶

期待する出力値
omikujiの中身は(30..100)なので大吉
omikujiの中身は(1..29)なので大凶
**/

// おみくじを作る
public class Main {
	public static void main(String[] args) {
		int omikuji = (int)(Math.random() * 100 + 1);  // randomメソッドについては次のチャプターで説明します
		if (omikuji>29) {
			System.out.println("omikujiの中身は" + omikuji + "なので大吉");
		} else {
			System.out.println("omikujiの中身は" + omikuji + "なので大凶");
		}
	}
}
