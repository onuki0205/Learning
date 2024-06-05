/**
4つの要素を持つweaponというArrayListが定義されています。
このArrayListから、インデックス2の要素を削除してください。
**/

// ArrayListの要素を削除する
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> weapon = new ArrayList<String>();
        weapon.add("木の棒");
        weapon.add("鉄の棒");
        weapon.add("鉄の剣");
        weapon.add("銅の剣");
        // ここに、要素を削除するコードを記述する
        weapon.remove(2);
        for (String item : weapon) {
            System.out.println(item);
        }
    }
}
