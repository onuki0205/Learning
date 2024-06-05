/**
引数の異なるsayHelloメソッドが定義されています。。
サンプル出力と同じように表示されるよう、sayHello()メソッドの呼び出しを追加してください。
**/

// オーバーロードされたメソッドを呼び出す
public class Main {
    public static void main(String[] args) {
        // この下で、sayHelloメソッドを呼び出す。
        sayHello("paiza");
        sayHello("java");

    }

    public static void sayHello(){
        System.out.println("hello paiza");
    }

    public static void sayHello(String target){
        System.out.println("hello " + target);
    }
}
