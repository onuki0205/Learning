/**
2のN乗を求めてください。
Nは、0から10まで増えていきます。2の0乗は1になります。
ただし、Math.powメソッドは、使用しないでください。また、本チャプターで使った方法を参考にして、配列を用いて計算します。
**/
// Nが、0から10まで増える時、2のN乗を計算する。Math.powは使わない
// 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
// ループを1つだけ用いて作成
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 10;
        long[] pow = new long[number + 1];

        pow[0] = 1; // 2の0乗は1

        for (int i = 0; i <= number; i++) {
            if (i >= 1) {
                pow[i] = pow[i-1] * 2; // (ここを修正) 2の(i-1)乗から2のi乗の値を求める
            }
            System.out.println(i + ": " + pow[i]);
        }
    }
}
