/**
sayHelloメソッドを呼び出していますが、エラーになってしまいます。
間違いを修正して、「hello paiza」と表示されるようにしてください。
**/

// 間違い探し

public class Main {
    public static void main(String[] args) {
        Greeting paiza = new Greeting();
        paiza.sayHello();
    }
}

class Greeting {
    public void sayHello() {
        System.out.println("hello paiza");
    }
}
