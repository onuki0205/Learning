/**
text変数に文字列が代入されています。この文字列の文字数をテキストとして出力してください。
なお、文字数はスペースも含めます。
**/

// 配列に対してメソッドを実行する

public class Main {
    public static void main(String[] args) {
        String text = new String("hello java");
        //この下に、文字数をテキストとして表示する処理を記述する
        System.out.println(text.length());
    }
}
