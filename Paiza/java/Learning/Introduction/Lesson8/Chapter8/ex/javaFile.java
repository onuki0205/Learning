/**
標準入力からテキストを読み込んで、「AAAは、スライムと戦った」と表示するプログラムですがエラーになってしまいます。このプログラムを修正して、正常に動作するようにしてください。


**/

//間違い探し

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String player = sc.next();
        System.out.println(player + "は、スライムと戦った");
    }
}
