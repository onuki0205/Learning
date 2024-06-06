/**
数値を1から100まで、コロン(:)をつけて出力します。
このプログラムを修正して、数値が3で割り切れる場合は「数値: Hoge」、
数値が5で割り切れる場合は「数値: Fuga」、
数値が3でも5でも割り切れる場合は「数値: HogeFuga」、
それ以外の場合は、数値をそのまま出力してください。
ただし、else文とelse if文は使用しないでください。
**/
// Fizz、Buzzの代わりに、Hoge、Fuga。100まで出力する。ただし、else文else if文を用いないこと。
public class Main {
    public static void main(String[] args) throws Exception {
        String output;
        for (int i = 1; i <= 100; i++) {
            output = "";
            // 3の倍数のとき
            if (i % 3 == 0) {
                output += "Hoge"; // ここを修正
            }
            // 5の倍数のとき
            if (i % 5 == 0) {
                output += "Fuga"; // ここを修正
            }
            // 出力する文字列の左側に番号を連結
            output = String.valueOf(i) + ": " + output;
            System.out.println(output);
        }
    }
}
