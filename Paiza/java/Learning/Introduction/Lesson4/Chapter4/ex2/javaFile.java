/**
numbers配列に数値が格納されています。
この全要素の合計値を計算して出力してください。
**/

// 要素を合計を計算する

public class Main {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 56, 78, 90};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            // ここに、合計を計算するコードを記述する
            sum += numbers[i];

        }
        System.out.println(sum);
    }
}
