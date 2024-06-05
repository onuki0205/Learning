/**
Greetingクラスを継承したHelloクラスが定義されています。
そして、Greetingオブジェクトを実体化して、player変数に割り当てています。

このplayer変数に、Helloオブジェクトを実体化して割り当てください。


**/

// メソッドをオーバーライドしよう2
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
    public void sayHello(){
        System.out.println("hello paiza");
    }
}
