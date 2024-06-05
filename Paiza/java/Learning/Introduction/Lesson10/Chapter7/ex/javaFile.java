/**
簡単な割り算プログラムです。強制的にゼロ除算例外を発生するはずですが、コンパイルエラーになってしまいます。ゼロで割り算した時に、下記のエラーメッセージを表示するようコードを修正してください。

**/

// 例外処理 - 間違い探し

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        try {
            int answer = 100 / 0;
            System.out.println(answer);
            throw new ArithmeticException("強制エラー");
        } catch (NumberFormatException e) {
            System.err.println("数値を入力してください");
        } catch (ArithmeticException e) {
            System.err.println("0では割り算できません");
        } catch (Exception e) {
            System.err.println("例外が発生しました");
        } finally {
            System.out.println("Hello Java");
        }
    }
}
