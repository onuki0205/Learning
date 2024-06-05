/**
実行するたびに、1から10までの数値をランダムに生成して、順位として表示します。ここにif文を追加して、2位から5位の時には「あと少し」と表示するようにしてください。

期待する出力値
あなたの順位は(2..5)位です
あと少し
-----
あなたの順位は(1)位です
あなたの順位は(6..10)位です
**/

// 順位に合わせてメッセージを表示する

public class Main {
    public static void main(String[] args) {
        double rand = (Math.random() * 10) + 1;
        int number = (int) rand;
        System.out.println("あなたの順位は" + number + "位です");

        //　ここにifを追加する
        if (number > 1 && number <6) System.out.println("あと少し");

    }
}
