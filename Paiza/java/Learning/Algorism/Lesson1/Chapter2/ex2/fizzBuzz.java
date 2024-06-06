/**
数値を1から100まで、コロン(:)をつけて出力します。
このプログラムを修正して、数値が４で割り切れる場合は「数値: Hoge」、
数値が6で割り切れる場合は「数値: Fuga」、
数値が4でも6でも割り切れる場合は「数値: HogeFuga」、
それ以外の場合は「数値: Piyo」と出力してください。
ただし、else文とelse if文は使用しないでください。
**/
// Hoge, Fuga, Piyo - else if文、else文を用いない
public class Main {
    public static void main(String[] args) throws Exception {
        String output;
        for (int i = 1; i <= 100; i++) {
            output = i + ": ";
            if (i % 4 == 0) {
                output += "Hoge";
            }
            if (i % 6 == 0) {
                output += "Fuga";
            }
            if (i % 4 != 0 && i % 6 != 0) { // iが4でも6でも割り切れないとき
                output += "Piyo";
            }
            //output = String.valueOf(i) + ": " + output;
            System.out.println(output);
        }
    }
}
