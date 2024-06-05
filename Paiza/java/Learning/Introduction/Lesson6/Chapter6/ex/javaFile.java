/**
RPGの攻撃シーンを表示するプログラムですが、エラーになってしまいます。
enemiesの要素を順番に、「勇者はxxxを攻撃した」と表示するように修正してください。
**/

// 間違い探し - RPGの攻撃シーン

public class Main {
    public static void main(String[] args) {
        String player = "勇者";
        String[] enemies = {"スライム", "モンスター", "ドラゴン"};


        for (String enemy : enemies) {
            System.out.println(player + "は" + enemy + "を攻撃した");
        }

        System.out.println(player + "はすべての敵を倒した");
    }
}
