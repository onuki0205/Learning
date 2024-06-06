/**
0から50までのトリボナッチ数を出力してください。
ただし、本チャプターで使った方法を参考にして、再帰を用いて計算します。
コードの実行をして、エラーが出なければ、演習課題クリアです。

トリボナッチ数とは、次のように定義される数列です。

T(0) = 0
T(1) = 0
T(2) = 1
T(n) = T(n - 1) + T(n - 2) + T(n - 3)

たとえば、4番目のトリボナッチ数は、次のように計算します。

T(4) = T(3) + T(2) + T(1) = 1 + 1 + 0 = 2
**/

// トリボナッチ数
// 0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149
// 再帰を用いて作成
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 50;
        for (int i = 0; i <= number; i++) {
            System.out.println(i + ": " + tribonacci(i));
        }
    }
    public static long tribonacci(int num) {
        // トリボナッチ数の最初の3項(0, 0, 1)を用いて，再帰呼び出し
        return tri2(0, 0, 1, num);
    }
    public static long tri2(long a, long b, long c, long d) {
        // 再帰の深さがd
        if (d < 2) {
            return a;
        }
        // 再帰呼び出し
        return tri2(b, c, c, d - 1); // この行を修正
    }
}
