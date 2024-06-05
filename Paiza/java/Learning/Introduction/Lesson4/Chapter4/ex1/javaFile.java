/**
RPGの敵が、enemy配列で定義されています。
この配列から要素を順に取り出して、「＊＊が現れた」と出力してください。
**/

// 配列の中身をループで表示する

public class Main {
    public static void main(String[] args) {
        String[] enemy = {"スライム", "モンスター", "ゾンビ", "ドラゴン", "魔王"};
        // ここに、要素をループで表示するコードを記述する
        for(int i=0; i<enemy.length; i++) System.out.println(enemy[i]+"が現れた");
    }
}
