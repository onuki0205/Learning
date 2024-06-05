/**
RPGの勇者の行動を3行表示しますが、enemies配列の範囲外にアクセスするため、例外が発生してしまいます。
このプログラムで、例外が発生した時に、標準エラー出力に下記のメッセージを表示して下さい。
**/

// 例外メッセージを指定しよう

public class Main {
    public static void main(String[] args) {
        String[] enemies = {"スライム", "ドラゴン", "魔王" };

        try {
            int number = 3;
            System.out.println("勇者は敵に遭遇した");
            System.out.println("勇者は" + enemies[number] + "と戦った");
        } catch (Exception e) {
            System.err.println("その敵は表示できません");
        } finally {
            System.out.println("勇者は勝利した");
        }
    }
}
