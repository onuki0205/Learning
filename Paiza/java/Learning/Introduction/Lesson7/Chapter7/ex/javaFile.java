/**
sayHelloメソッドを呼び出していますが、エラーになってしまいます。
間違いを修正して、「hello paiza」と表示されるようにしてください。

**/

// 間違い探し

public class Main {
    public static void main(String[] args) {
        Greeting paiza = new Greeting("paiza");
        paiza.sayHello();
    }
}

class Greeting {
    private String myName;

    public Greeting(String name) {
        myName = name;
    }

    public void sayHello() {
        System.out.println("hello " + myName);
    }
}
