/**
while命令を使って、0から15まで、数値を一行ずつ表示するプログラムを作成してください。

期待する出力値
0
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15

**/

// whileによるループ処理
public class Main {
    public static void main(String[] args) {
      int i = 0;
        while(i < 16){
            System.out.println(i);
            i++;
        }
    }
}
