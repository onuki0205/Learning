/**
「A」という文字のドットデータを標準入力から読み込むコードがあります。
このデータを2次元配列に格納してください。

このコードは、最初にドットデータの縦と横のサイズを、nとmに読み込みます。
**/

// 標準入力から文字のドットデータを読み込む
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] table = new int[n][m];
        // ここに、標準入力から2次元配列に代入するコードを書く
        for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    table[i][j] = sc.nextInt();
                }
            }


        // 2次元配列から文字を出力
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (table[i][j] == 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
