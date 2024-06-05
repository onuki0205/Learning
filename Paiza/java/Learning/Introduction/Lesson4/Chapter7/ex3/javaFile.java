/**
入力エリアのURLを読み込みます。
読み込んだURLを「/」で分割して、配列の各要素をprintlnメソッドで出力してください。
**/

// 標準入力から読み込んだURLを分割する
// https://paiza.jp/cgc/users/ready
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url_str = sc.next();
        // ここに文字列を分割するコードを記述する
        String[] url = url_str.split("/");
        for (String s : url) {
            System.out.println(s);
        }
    }
}
