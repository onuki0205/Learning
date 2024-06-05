/**
実行するたびに1926年から1988年までの西暦年をランダムに選んで表示します。ここにコードを追加して、昭和年を計算し「西暦◎◎◎◎年は昭和XX年です。」と表示してください。

なお、昭和年は、「seireki - 1925」で求めることができます。

期待する出力値
-----
西暦1988年は昭和63年です。
-----
西暦1926年は昭和1年です。
-----
**/

// 西暦年から昭和年を求める
public class Main {
	public static void main(String[] args) {
		int seireki = (int)(Math.random() * 63 + 1926);
		System.out.print("西暦" + seireki + "年は");

		// 昭和年を計算
		int showa = seireki - 1925;
		System.out.println("昭和" + showa + "年です。");
	}
}
