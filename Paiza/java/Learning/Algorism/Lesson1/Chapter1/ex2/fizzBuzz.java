/**
数値を1から100まで、コロン(:)をつけて出力します。
このプログラムを修正して、数値が４で割り切れる場合は「数値: Hoge」、
数値が6で割り切れる場合は「数値: Fuga」、
数値が4でも6でも割り切れる場合は「数値: HogeFuga」、
それ以外の場合は「数値: Piyo」と出力してください。
**/
// 4の倍数:Hoge、6の倍数:Fuga、それ以外:Piyo。100まで出力する
public class Main {
    public static void main(String[] args) throws Exception {
        String output;
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0 && i % 6 == 0) { // 4の倍数でかつ6の倍数のとき
                output = i + ": HogeFuga"; // ここを修正
            } else if (i % 4 == 0) { // 4の倍数のとき
                output = i + ": Hoge"; // ここを修正
            } else if (i % 6 == 0) { // 6の倍数のとき
                output = i + ": Fuga"; // ここを修正
            } else { // それ以外のとき
                output = i + ": Piyo"; // ここを修正
            }
            System.out.println(output);
        }
    }
}
