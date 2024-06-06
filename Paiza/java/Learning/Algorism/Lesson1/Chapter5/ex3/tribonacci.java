/**
0から30までのトリボナッチ数を出力してください。
ただし、本チャプターで使った方法を参考にして、再帰を用いて計算します。
コードの実行をして、エラーが出なければ、演習課題クリアです。

トリボッチ数とは、次のように定義される数列です。

T(0) = 0
T(1) = 0
T(2) = 1
T(n) = T(n - 1) + T(n - 2) + T(n - 3)

たとえば、4番目のトリボッチ数は、次のように計算します。

T(4) = T(3) + T(2) + T(1) = 1 + 1 + 0 = 2
**/

// トリボナッチ数
// 0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149
// 再帰を用いて作成
public class Main {
  public static void main(String[] args) throws Exception {
    int number = 30;
    for (int i = 0; i <= number; i++) {
      System.out.println(i + ": " + tribonacci(i));
    }
  }
  public static long tribonacci(int num) {
    if (num == 0) { // numが0ならば...
      return 0; // ここを修正
    }
    if (num == 1) { // numが1ならば...
      return 0; // ここを修正
    }
    if (num == 2) { // numが2ならば...
      return 1; // ここを修正
    }
    // 直前の3つのトリボナッチ数の和を返す
    return tribonacci(num-3) + tribonacci(num-2) + tribonacci(num-1); // ここを修正
  }
}
