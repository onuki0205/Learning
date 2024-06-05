/**
newキーワードを使って、次のような配列を作成してください。

・配列名は、array
・要素のデータ型は、int
・2 x 3の2次元配列
**/

// 2次元配列をnewで作成しよう
public class Main {
    public static void main(String[] args) {

        // この下で、配列を作成しよう
        int[][] array = new int[2][3];

        for (int[] item : array) {
            for (int num : item) {
                System.out.print(num);
            }
            System.out.println("");
        }
    }
}
