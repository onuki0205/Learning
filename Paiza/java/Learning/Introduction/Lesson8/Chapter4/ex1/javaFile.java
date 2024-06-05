/**
Greetingクラスに、say_helloメソッドが定義されており、
Greetingクラスを継承したHelloクラスが定義されています。

このHelloクラスで、sayHelloメソッドをオーバーライドして、以下のメッセージを表示してください。

hello paiza

**/

// メソッドをオーバーライドしよう
public class Main {
    public static void main(String[] args) {
        Hello player = new Hello();
        player.sayHello();
    }
}

class Greeting {
    public void sayHello(){
        System.out.println("greeting paiza");
    }
}

class Hello extends Greeting {
    // この下で、メソッドをオーバーライドする
    public void sayHello(){
        System.out.println("hello paiza");
    }
}
