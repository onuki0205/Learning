/**
sayHelloメソッドを呼び出していますが、エラーになってしまいます。
間違いを修正して、msg変数を使って、「hello paiza」と表示されるようにしてください。
**/

// 間違い探し その1

public class Main {
    public static void main(String[] args) {
        String text = "paiza";
        sayHello(text);
    }

    public static void sayHello(String msg) {
        System.out.println("hello " + msg);
    }
}
