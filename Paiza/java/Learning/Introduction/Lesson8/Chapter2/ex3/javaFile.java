/**
sayHelloメソッドを呼び出していますが、エラーになってしまいます。
間違いを修正して、「hello paiza」と表示されるようにしてください。
**/

// 間違い探し
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
    public void sayHello(){
        System.out.println(msg + " " + target);
    }
}
