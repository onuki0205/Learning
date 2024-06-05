/**
アイテムリストを作ってみましょう。
標準入力で出力するアイテム数と複数行のアイテム名の入力があります。
それを元に、itemImagesで定義された画像を1行ずつ順番に出力してみましょう。

HTMLで画像を1行ずつ表示する場合は以下のようにimgタグを利用します。
<img src="URL"><br>

※標準入力で与えられるアイテム名は、itemImagesに無いアイテムは
出てこないものとします。

**/

// 画像を順番に出力する
import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] items = new String[n];
        // 画像用ハッシュ
        HashMap<String, String> itemImages  = new HashMap<String, String>();
        itemImages.put("剣", "http://paiza.jp/learning/images/sword.png");
        itemImages.put("盾", "http://paiza.jp/learning/images/shield.png");
        itemImages.put("回復薬", "http://paiza.jp/learning/images/potion.png");
        itemImages.put("クリスタル", "http://paiza.jp/learning/images/crystal.png");

        // ここから下を書く
        for(int i = 0; i < n; i++){
          items[i] = sc.next();
        }

        for(String entry : items){
            System.out.println("<img src = '" + itemImages.get(entry) + "'>");
            System.out.println("<br>");
        }
    }
}
