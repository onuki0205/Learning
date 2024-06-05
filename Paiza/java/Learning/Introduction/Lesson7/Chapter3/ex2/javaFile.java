/**
GreetingクラスのsayHelloメソッドを呼び出していますが、メンバー変数とコンストラクタが記述されていません。
以下のテキストを表示するよう、メソッドにコードを追加してください。

hello java
**/

// メンバー変数とコンストラクタを追加しよう

public class Main {
    public static void main(String[] args) {
        Greeting paiza = new Greeting("java");
        paiza.sayHello();
    }
}

class Greeting {
    // この下に、メンバー変数とコンストラクタを追加する
    private String myName;

    public Greeting(String name){
        myName = name;
    }

    public void sayHello() {
        System.out.println("hello " + myName);
    }
}
