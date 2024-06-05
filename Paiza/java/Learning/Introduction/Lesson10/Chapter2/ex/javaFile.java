/**
RPGの勇者の行動を3行表示しますが、enemies配列の範囲外にアクセスするため、例外が発生してプログラムが強制終了してしまいます。
このプログラムに、try-catch-finallyを追加して、例外が発生してもプログラムが強制終了しないようにして下さい。

**/

// 例外処理を定義しよう

public class Main {
    public static void main(String[] args) {
        String[] enemies = {"スライム", "ドラゴン", "魔王" };

        int number = 3;
        System.out.println("勇者は敵に遭遇した");
        try {
            System.out.println("勇者は" + enemies[number] + "と戦った");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("勇者は勝利した");
        }
    }
}
