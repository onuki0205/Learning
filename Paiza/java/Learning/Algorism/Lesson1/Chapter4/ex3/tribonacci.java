/**
0から50までのトリボナッチ数を出力してください。
ただし、本チャプターで使った方法を参考にして、配列を用いて計算します。
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
// 0, 0, 1, 2, 4, 7, 13, 24, 44, 81, 149
// ループを1つだけ用いて作成
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 50;
        long[] tri = new long[number + 1];

        tri[0] = 0; // (ここを修正) 0番目のトリボナッチ数は0
        tri[1] = 0; // (ここを修正) 1番目のトリボナッチ数は0
        tri[2] = 1; // (ここを修正) 2番絵のトリボナッチ数は1

        for (int i = 0; i <= number; i++) {
            if (i >= 3) {
                // 直前の3つのトリボナッチ数から次のトリボナッチ数を求める
                tri[i] = tri[i-3] + tri[i-2] + tri[i-1]; // (ここを修正)
            }
            System.out.println(i + ": " + tri[i]);
        }
    }
}
