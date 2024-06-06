/**
閏(うるう)年を求めるプログラムを完成させてください。
seireki変数には、西暦年として 1~3000 までの数字がランダムに代入されます。seireki変数の数値が閏年なら、seireki + " leap year"と出力させます。そうでなれば、seireki変数の数値だけを出力させます。

西暦年が閏年である条件は次の通りです。
・西暦年が400で割り切れる年は閏年
・それ以外で、西暦年が100で割り切れる年は平年
・それ以外で、西暦年が4で割り切れる年は閏年
**/
//グレゴリオ暦の閏年判定 - 乱数版
public class Main {
    public static void main(String[] args) throws Exception {
        int seireki = (int)(Math.random() * 3000 + 1);

        if (seireki % 400 == 0) { // (ここを修正) 西暦年が400で割り切れるとき
            System.out.println(seireki + " leap year");
        } else if (seireki % 100 == 0) { // (ここを修正) それ以外で、西暦年が100で割り切れるとき
            System.out.println(seireki);
        } else if (seireki % 4 == 0) { // (ここを修正) それ以外で、西暦年が4で割り切れるとき
            System.out.println(seireki + " leap year");
        } else { // それ以外のとき
            System.out.println(seireki);
        }
    }
}
