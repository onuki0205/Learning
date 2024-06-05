/**
basket配列が定義されています。
この配列の「こん棒」を、「石斧」に書き換えてください。
**/

// 2次元配列の要素を更新する
public class Main {
    public static void main(String[] args) {
        String[][] basket = {{"木の棒", "こん棒"}, {"おにぎり", "おにぎり"}, {"毒消し", "薬草"}};

        // ここに、要素を更新するコードを記述する
        basket[0][1] = "石斧";

        System.out.println(basket[0][0]);
        System.out.println(basket[0][1]);
        System.out.println(basket[1][0]);
        System.out.println(basket[1][1]);
        System.out.println(basket[2][0]);
        System.out.println(basket[2][1]);
    }
}
