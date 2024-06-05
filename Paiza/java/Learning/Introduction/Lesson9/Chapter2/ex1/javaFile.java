/**
RPGのプレイヤーのスキルがHashMapで記述されています。
このHashMapに、以下のエントリーを追加して、値だけを出力してください。

防御力 : 100
魔法力 : 200
移動力 : 380


**/

// 指定の文字をハッシュにする
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
      HashMap<String, Integer> skills = new HashMap<String, Integer>();
        skills.put("攻撃力", 150);
        System.out.println(skills.get("攻撃力"));
        // この下に、エントリーを追加する
        skills.put("攻撃力", 100);
        System.out.println(skills.get("攻撃力"));
        skills.put("魔法力", 200);
        System.out.println(skills.get("魔法力"));
        skills.put("移動力", 380);
        System.out.println(skills.get("移動力"));

    }
}
