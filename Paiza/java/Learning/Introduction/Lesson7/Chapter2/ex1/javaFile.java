/**
Greetingクラスに、メッセージを表示するsayHelloメソッドが定義されています。
このクラスを実体化して、sayHelloメソッドを呼び出し、メッセージを表示してください。
**/

// インスタンスを実体化しよう

public class Main {
    public static void main(String[] args) {
        // この下でGreetingオブジェクトをつくり、メソッドを呼び出す
        Greeting greeting = new Greeting();
        greeting.sayHello();

    }
}

class Greeting {
    public void sayHello() {
        System.out.println("hello paiza");
    }
}
