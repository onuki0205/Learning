/**
数値を1から100まで、コロン(:)をつけて出力します。
このプログラムを修正して、数値が3で割り切れる場合は「数値: Hoge」、
数値が5で割り切れる場合は「数値: Fuga」、
数値が3でも5でも割り切れる場合は「数値: HogeFuga」、
それ以外の場合は、そのまま数値を出力してください。
**/
// Fizz、Buzzの代わりに、Hoge、Fuga。100まで出力する
public class Main {
    public static void main(String[] args) throws Exception {
        String output;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // 3の倍数でかつ5の倍数のとき
                output = i + ": HogeFuga"; // ここを修正
            } else if (i % 3 == 0) { // 3の倍数のとき
                output = i + ": Hoge"; // ここを修正
            } else if (i % 5 == 0) { // 5の倍数のとき
                output = i + ": Fuga"; // ここを修正
            } else { // 上のすべての条件を満たさなかったとき
                output = i + ": ";
            }
            System.out.println(output);
        }
    }
}
