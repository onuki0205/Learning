/**
Greetingクラスに、「hello XXX」と表示するsayHelloメソッドが定義されています。
「XXX」の部分は、オブジェクトを作成する時に指定できます。

このクラスからオブジェクトを作成して、sayHelloメソッドを呼び出し、「hello paiza」と表示してください。
**/

// インスタンスを実体化しよう

public class Main {
    public static void main(String[] args) {
        // この下に、インスタンスを実体化し、メソッド呼び出しを記述する
        Greeting greeting = new Greeting("paiza");
        greeting.sayHello();

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
