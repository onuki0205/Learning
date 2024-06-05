/**
skillsというマップが定義されています。
このマップの値をループを使って出力してください。
このとき、マップのエントリーを以下の形式で出力します。

"キー"は"値"です
**/

// ループでマップのキーと値を出力しよう
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> skills = new HashMap<String, Integer>();
        skills.put("攻撃力", 150);
        skills.put("防御力", 100);
        skills.put("魔法力", 200);
        skills.put("移動力", 380);

        // この下で、マップの値をループで出力する
        for(Entry<String, Integer> entry: skills.entrySet()) {
            System.out.println(entry.getKey() + "は" + entry.getValue()+ "です");
        }
      }
}
