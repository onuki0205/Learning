/**
GreetingクラスのsayHelloメソッドを呼び出していますが、メソッドの処理が記述されていません。
以下のテキストを表示するよう、メソッドにコードを追加してください。

hello java
**/

// クラスにメソッドを定義しよう

public class Main {
    public static void main(String[] args) {
        Greeting paiza = new Greeting();
        paiza.sayHello();
    }
}

class Greeting {
    // この下に、sayHelloメソッドを記述する
    public void sayHello(){
        System.out.println("hello java");
    }

}
