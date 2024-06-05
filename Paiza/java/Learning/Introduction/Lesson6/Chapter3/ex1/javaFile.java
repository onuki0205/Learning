/**
2つの引数を掛け算するmultiメソッドが定義されています。
このメソッドを呼び出して、「33ｘ44」の計算結果を表示してください。
**/

// 掛け算メソッドを呼び出してみよう

public class Main {
    public static void main(String[] args) {
        //この下にメソッド呼び出して、出力する
        int num = 0;
        num = multi(33,44);
        System.out.println(num);
    }

    public static int multi(int x, int y) {
        return x * y;
    }
}
