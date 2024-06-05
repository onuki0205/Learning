/**
RPGの敵の名前を、入力エリアから複数行データとして読み込んで出力します。
この文字列を、「＊＊が現れた」という形式で出力してください。

**/

// 読み込んだ複数行を出力する
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line+"が現れた");
        }
    }
}
