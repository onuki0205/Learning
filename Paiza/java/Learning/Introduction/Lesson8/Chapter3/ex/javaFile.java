/**
Greetingクラスが定義されており、それを継承したHelloクラスが定義されていますが、エラーになってしまいます。
Helloクラスにコンストラクタを定義して、「hello paiza」と表示されるようにしてください。
**/

// サブクラスにコンストラクタを定義しよう
public class Main {
    public static void main(String[] args) {
        Hello player = new Hello("paiza");
        player.sayHello();
    }
}

class Greeting {
    public String target;

    public Greeting(String name) {
        target = name;
    }
}

class Hello extends Greeting {
    // この下にコンストラクタを定義する
    public Hello(String name){
        super(name);
    }

    public void sayHello(){
        System.out.println("hello " + target);
    }
}
