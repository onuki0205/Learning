/**
Nの階乗を求めてください。
Nは、0から10まで増えていきます。
ただし、本チャプターで使った方法を参考にして、配列を用いて計算します。

階乗は、1からNまでを掛け合わせて計算します。
たとえば、5の階乗は、1×2×3×4×5で求めます。0の階乗は1になります。
**/
// Nが、0から10まで増える時、Nの階乗を計算する。
// 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800
// ループを1つだけ用いて作成
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 10;
        long[] perm = new long[number + 1];

        perm[0] = 1; // 0の階乗の値は1

        for (int i = 0; i <= number; i++) {
            if (i >= 1) {
                perm[i] = perm[i-1] * i; // (ここを修正) (i-1)の階乗の値からiの階乗の値を求める
            }
            System.out.println(i + ": " + perm[i]);
        }
    }
}
