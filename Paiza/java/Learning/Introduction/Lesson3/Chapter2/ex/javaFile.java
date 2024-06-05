/**
whileを使って、1から10までの偶数を一行ずつ表示するプログラムを作成してください。

**/

// whileによるループ処理
public class Main {
    public static void main(String[] args) {
      int i = 1;
      while(i < 11){
        if(i % 2 == 0) System.out.println(i);
        i++;
      }
    }
}
