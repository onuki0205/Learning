/**
Greetingクラスにメンバー変数msgとtargetが定義されています。
このGreetingクラスを継承したHelloクラスを作り、sayHello()メソッドを定義してください。
このコードでは、HelloクラスのsayHelloメソッドを呼び出していますが、メソッドが記述されていません。
sayHello()メソッドは、以下の変数でメッセージを表示するようにしてください。

msg + " " + target
**/

// クラスを継承しよう
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

// この下に、Greetingクラスを継承した、Helloクラスを定義する。
// そこに、sayHello()メソッドの定義を記述する。
class Hello extends Greeting{
    public void sayHello(){
        System.out.println(msg + " " + target);
    }
}
