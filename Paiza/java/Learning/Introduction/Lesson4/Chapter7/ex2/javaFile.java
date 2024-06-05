/**
ある英文がstrという文字列に代入されています。
この文字列を、splitメソッドを使って、スペースのところで分割して、単語の数を出力してください。
**/

// 英文の単語数を数える

public class Main {
    public static void main(String[] args) {
        String str = "One cold rainy day when my father was a little boy he met an old alley cat on his street";
        // ここに文字列を分割するコードを記述する
        int count = str.split(" ").length;
        System.out.println(count);
    }
}
