/**
標準入力から受け取った値に合わせて、RPGの勇者の行動を3行表示します。
このプログラムで、例外の種類に合わせて、下記のエラーメッセージを標準エラー出力に表示して下さい。

文字を入力 : 数値を入力してください
配列の範囲外にアクセス : 0から(配列の最大インデックス)を入力してください

**/

//標準入力でモンスターを選択する

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // モンスターを配列で記述する
        String[] enemies = {"スライム", "ドラゴン", "魔王" };

        try {
            // 標準入力から整数を入力
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.next());

            // 入力値に合わせて、プレイヤー名を表示する
            System.out.println("勇者は敵に遭遇した");
            System.out.println("勇者は" + enemies[number] + "と戦った");

        } catch (ArrayIndexOutOfBoundsException e) {
        　  System.err.println("0から" + (enemies.length - 1) + "を入力してください");
      　} catch (NumberFormatException e) {
        　  System.err.println("数値を入力してください");
        } finally {
            System.out.println("勇者は勝利した");
        }
    }
}
