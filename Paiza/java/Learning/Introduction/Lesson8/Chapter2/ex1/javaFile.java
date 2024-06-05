/**
Greetingクラスにメンバー変数msgとtargetが定義されており、Greetingクラスを継承したHelloクラスが定義されています。
このコードでは、HelloクラスのsayHelloメソッドを呼び出していますが、メソッドが記述されていません。
sayHello()メソッドでは、以下の変数でメッセージを表示するようにしてください。

msg + " " + target
**/

// クラスにメソッドを定義しよう
public class Main {
    public static void main(String[] args) {
        Hello player = new Hello();
        player.sayHello();
    }
}

class Greeting {
    public String msg;
    public String target;

    public Greeting() {
        msg = "hello";
        target = "paiza";
    }
}

class Hello extends Greeting {
    // この下に、sayHelloメソッドを記述する
    public void sayHello(){
        System.out.println(msg + " " + target);
    }

}
