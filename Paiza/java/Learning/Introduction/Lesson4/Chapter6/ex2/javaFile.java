/**
3つの要素を持つweaponというArrayListが定義されています。
このArrayListのインデックス2の要素を、「石斧」に書き換えてください。
**/

// ArrayListの要素を上書きする
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> weapon = new ArrayList<String>();
        weapon.add("木の棒");
        weapon.add("鉄の剣");
        weapon.add("サビた剣");
        // ここに、要素を上書きするコードを記述する
        weapon.set(2,"石斧");
        for (String item : weapon) {
            System.out.println(item);
        }
    }
}
