/**
Nの階乗を求めてください。
Nは、0から10まで増えていきます。
ただし、本チャプターで使った方法を参考にして、再帰を用いて計算します。

階乗は、1からNまでを掛け合わせて計算します。
たとえば、5の階乗は、1×2×3×4×5で求めます。0の階乗は1になります。
**/

// Nが、0から10まで増える時、Nの階乗を計算する。
// 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800
// 再帰を用いて作成
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 10;
        for (int i = 0; i <= number; i++) {
            System.out.println(i + ": " + permutation(i));
        }
    }
    public static int permutation(int num) {
        // 0の階乗は1
        if (num == 0) {
            return 1;
        }
        // (num-1)の階乗にnumを掛けた値を返す
        return permutation(num - 1) * num; // ここを修正
    }
}
