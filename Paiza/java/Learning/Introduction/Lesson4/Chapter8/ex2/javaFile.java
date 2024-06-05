/**
入力エリアから複数行データとして読み込みます。
入力エリアには、RPGの敵の名前Aと匹数Bが、カンマ区切りで用意してあります。
読み込んだデータをカンマで分割して、「AがB匹現れた」と出力してください。

**/

// 複数行のカンマ区切りデータを出力する
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            // ここに、文字列を分割して、出力するコードを書く
            System.out.println(line.split(",")[0]+"が"+line.split(",")[1]+"匹現れた");
        }
    }
}
