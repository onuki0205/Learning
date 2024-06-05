/**
100グラム128円の肉が、300グラムある場合の価格を計算しますが、正しく計算されません。間違いを修正して、肉の価格を出力してください。

期待する出力値
100グラム128円の肉、300グラムは、384円です。

**/

// 肉の量り売り

public class Main {
    public static void main(String[] args) {
        int price = 128;
        int weight = 300;
        int amount = price * weight / 100;
        System.out.println("100グラム" + price + "円の肉、" + weight + "グラムは、" + amount + "円です。");
    }
}
