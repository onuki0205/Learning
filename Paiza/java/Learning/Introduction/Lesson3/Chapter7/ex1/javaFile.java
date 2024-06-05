/**
標準入力から文字列を1行取得して、テキストを出力するプログラムを作成してください。
読み込む文字列には、空白やタブは含まれません。
**/
// 標準入力
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
    }
}
