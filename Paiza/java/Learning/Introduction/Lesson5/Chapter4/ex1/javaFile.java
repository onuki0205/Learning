/**
2次元配列が定義されています。
この配列をforを使って出力してください。
**/

// ループで2次元配列を出力してみよう
public class Main {
    public static void main(String[] args) {
        String[][] array = {{"勇者", "忍者"}, {"武士", "戦士"}, {"僧侶", "魔法使い"}};

        // この下で、forループで、arrayを出力してみよう
        for (int i = 0; i < array.length; i++) {
            for(int j = 0;  j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
