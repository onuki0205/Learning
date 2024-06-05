/**
おみくじの出目(例：大吉,中吉,吉,凶)が用意してあります。
右のコードエリアに、おみくじプログラムを作ってください。
おみくじは、標準入力から読み込んだ文字列をカンマで分割して、そのうち1つをランダムに出力します。

**/

// おみくじプログラム
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 標準入力から1行取得
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        // カンマで分割して、配列に代入
        String[] omikuji = line.split(",");

        // 配列の要素をランダムに選ぶ
        double rand = Math.random()*omikuji.length;
        int num = (int)rand;

        // ランダムに選んだ配列の要素を出力
        System.out.println(omikuji[num]);
    }
}
