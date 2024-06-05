/**
RPGの敵が、enemy配列で定義されています。
拡張forで、この配列から要素を順に取り出して、「＊＊が現れた」と出力してください。
**/

// 配列の中身をループで表示する

public class Main {
    public static void main(String[] args) {
        String[] enemy = {"スライム", "モンスター", "ゾンビ", "ドラゴン", "魔王"};
        // ここに、要素をループで表示するコードを記述する
        for(String str : enemy){
          System.out.println(str+"が現れた");
        }
    }
}
