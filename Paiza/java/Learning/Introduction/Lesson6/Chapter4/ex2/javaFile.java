/**
足し算をするsumメソッドを呼び出していますが、エラーになってしまいます。
間違いを修正して、「12 + 34」の計算結果が正しく表示されるようにしてください。
**/

// 間違い探し その2

public class Main {
    public static void main(String[] args) {
        int num = sum(12, 34);
        System.out.println(num);
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
