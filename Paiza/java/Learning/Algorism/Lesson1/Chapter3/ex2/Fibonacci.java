/**
Nの階乗を求めてください。
Nは、0から10まで増えていきます。

階乗は、1からNまでを掛け合わせて計算します。
たとえば、5の階乗は、1×2×3×4×5で求めます。0の階乗は1になります。
**/
// Nが、0から10まで増える時、Nの階乗を計算する。
// 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800
import java.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 10;
        for (int i = 0; i <= number; i++) {
            System.out.println(i + ": " + permutation(i));
        }
    }

    public static int permutation(int num) {
        int perm = 1;
        // (ここに追記) permに1からnumまでの値をかけた値を代入する
        for (int i = 1; i <= num; i++){
          perm  = Math.pow(perm,i);
        }
        return perm;
    }
}
