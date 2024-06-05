/**
九九の2の段を出力するプログラムです。
このプログラムを修正して、九九を1の段から9の段まで出力してください。
各段は、行末で改行してください。
**/

// 九九の表を作成してみよう

public class Main {
    public static void main(String[] args) {
      for(int i = 1; i <= 9; i++){}
        for (int j = 1; j <= 9; j++) {
            System.out.print(multi(i, j));
            if (j < 9) {
                System.out.print(", ");
            } else {
                System.out.println("");
            }
        }
      }
    }

    public static int multi(int x, int y) {
        return x * y;
    }
}
