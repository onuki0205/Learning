/**
実行するたびに、30から100までの数値をランダムに生成して、不快指数として表示します。
ここにif文を追加して、55以下か70以上の時に「不快です」と表示するようにしてください。

期待する出力値
不快指数は(30..55)です。
不快です
-----
不快指数は(56..69)です。
-----
不快指数は(70..100)です。
不快です

**/

// 不快指数

public class Main {
    public static void main(String[] args) {
        double rand = (Math.random() * 71) + 30;
        int discomfort = (int) rand;
        System.out.println("不快指数は" + discomfort + "です。");

        //　ここにifを追加する
        if(discomfort <= 55 || discomfort >= 70)
        System.out.println("不快です");
    }
}
