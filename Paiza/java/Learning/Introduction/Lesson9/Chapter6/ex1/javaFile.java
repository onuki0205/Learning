/**
itemImages配列を使用して、
1行づつHTMLで画像を表示してみましょう。

HTMLで画像を1行ずつ表示する場合は以下のようにimgタグを利用します。
<img src="URL"><br>

**/

// 画像を順番に出力する
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 画像用ハッシュ
        HashMap<String, String> itemImages  = new HashMap<String, String>();
        itemImages.put("剣", "http://paiza.jp/learning/images/sword.png");
        itemImages.put("盾", "http://paiza.jp/learning/images/shield.png");
        itemImages.put("回復薬", "http://paiza.jp/learning/images/potion.png");
        itemImages.put("クリスタル", "http://paiza.jp/learning/images/crystal.png");

        // アイテムの並び順配列
        String[] itemOrders = {"剣", "回復薬", "盾", "クリスタル"};

        // ここから下で画像を出力する
        for(String entry : itemOrders){
          System.out.println("<img src = '" + itemImages.get(entry) + "'>");
          System.out.println("<br>");
        }
    }
}
