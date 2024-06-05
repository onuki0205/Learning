/**
RPGの勇者の行動を3行表示します。
しかし、enemies配列の範囲外にアクセスするため例外が発生するのですが、捕捉する例外が異なるため、プログラムが強制終了してしまいます。
このプログラムにcatchブロックを追加して、配列の範囲外にアクセスした場合の例外を捕捉してください。追加したブロックでは、標準エラー出力に下記のメッセージを表示して下さい。
**/

// 複数の例外を捕捉しよう

public class Main {
    public static void main(String[] args) {
        String[] enemies = {"スライム", "ドラゴン", "魔王" };

        try {
            int number = 3;
            System.out.println("勇者は敵に遭遇した");
            System.out.println("勇者は" + enemies[number] + "と戦った");
        } catch (NumberFormatException e) {
            System.err.println("文字列を数値に変換できません。");
        } catch (ArithmeticException e) {
            System.err.println("算術エラー");
        } catch (Exception e) {
              System.err.println("その敵は表示できません");
        } finally {
            System.out.println("勇者は勝利した");
        }
    }
}
