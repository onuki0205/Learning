/**
2のN乗を求めてください。
Nは、0から10まで増えていきます。2の0乗は1になります。
ただし、Math.powメソッドは、使用しないでください。また、本チャプターで使った方法を参考にして、再帰を用いて計算します。
**/

// Nが、0から10まで増える時、2のN乗を計算する。Math.powは使わない
// 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
// 再帰を用いて作成
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 10;
        for (int i = 0; i <= number; i++) {
            System.out.println(i + ": " + power(i));
        }
    }
    public static int power(int num) {
        // 2の0乗は1
        if (num == 0) {
            return 1;
        }
        // 2の(num-1)乗に2を掛けた値を返す
        return power(num - 1) * 2; // ここを修正
    }
}
