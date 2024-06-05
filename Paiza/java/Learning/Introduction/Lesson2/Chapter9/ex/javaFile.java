/**
実行するたびに、1から10までの数値をランダムに生成して、順位として表示します。そして、flag変数に、3位以内かどうかの評価結果を代入します。

ここにif文を追加して、flag変数がtrueの時に「入賞おめでとう」と表示するようにしてください。

期待する出力値
あなたの順位は(1..3)位です
入賞おめでとう
-----
あなたの順位は(4..10)位です

**/

// 順位に合わせてメッセージを表示する

public class Main {
    public static void main(String[] args) {
        double rand = (Math.random() * 10) + 1;
        int number = (int) rand;
        System.out.println("あなたの順位は" + number + "位です");

        boolean flag = number <= 3;
        //　ここにifを追加する
        if(flag == true) System.out.println("入賞おめでとう");
    }
}
