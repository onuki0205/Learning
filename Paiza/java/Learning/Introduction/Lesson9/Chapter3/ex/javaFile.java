/**
skillsというHashMapが定義されています。
このHashMapのサイズを出力してください。

**/

//  マップのサイズを出力してみよう
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> skills = new HashMap<String, Integer>();
        skills.put("攻撃力", 150);
        skills.put("防御力", 100);
        skills.put("魔法力", 200);
        skills.put("移動力", 380);

        // この下で、HashMapのサイズを出力する
        System.out.println(skills.size());
    }
}
