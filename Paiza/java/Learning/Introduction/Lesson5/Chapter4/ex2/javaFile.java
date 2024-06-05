/**
2次元配列が定義されています。
この配列をprintlnメソッドを使って出力してください。
**/

// 拡張forで2次元配列を出力してみよう
public class Main {
    public static void main(String[] args) {
        String[][] array = {{"勇者", "忍者"}, {"武士", "戦士"}, {"僧侶", "魔法使い"}};

        for (String[] team : array) {
            for (String player : team) {
                // この下で、arrayの要素を出力してみよう
                System.out.println(player);
            }
        }
    }
}
