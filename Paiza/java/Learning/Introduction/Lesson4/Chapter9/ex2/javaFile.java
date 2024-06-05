/**
入力エリアに、じゃんけんの手(例：グー,チョキ,パー)が用意してあります。
右のコードエリアのコメントを参考にして、じゃんけんプログラムを作ってください。
じゃんけんの手は、標準入力から読み込んだ文字列をカンマで分割して、そのうち1つをランダムに出力します。
**/

// じゃんけんプログラム

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 標準入力から1行取得
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // カンマで分割して、配列に代入
        String[] strs = str.split(",");

        // 配列の要素をランダムに選ぶ
        double rand = Math.random()*strs.length;
        int num = (int)rand;


        // ランダムに選んだ配列の要素を出力
        System.out.println(strs[num]);
    }
}
