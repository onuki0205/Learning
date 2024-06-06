/**
ハノイの塔で、円盤4枚を再帰で移動します。また、移動回数をcount変数で保持しており、移動手順は出力しません。このプログラムを修正して、円盤4枚の移動回数だけを出力してください。
**/

// ハノイの塔の解説 - 移動回数を調べる
import java.util.*;

class Main {
    /*
    piles    :  3本の杭をListに格納
    名前なし :  杭は、LinkedList。円盤を格納
    名前なし :  円盤は、円盤の大きさを整数で表す。 ex. 4 3 2 1
    */

    static List<LinkedList<Integer>> piles;
    static int count;

    static void initialize(int n) {
        piles = new LinkedList<>();

        // 3本の杭を作る
        for (int i=0; i<3; i++)
            piles.add(new LinkedList<>());

        // 0番目の杭に、n枚の円盤を追加
        for (int i=n; i>=1; i--)
            piles.get(0).add(i);

        count = 0;
    }

    static void printPiles() {
        System.out.println("--");
        System.out.println("count: " + count);

        for (int i=0; i<3; i++) {
            System.out.print(i + ":");
            for (int disk : piles.get(i))
                System.out.print(" " + disk);

         	System.out.println();
        }
    }

    static void moveOne(int from, int to) {
        int disk = piles.get(from).removeLast();
        piles.get(to).add(disk);
        count++;
    }

    static void hanoi(int n, int from, int to, int work) {
        if (n == 0) {
            return;
        }

        hanoi(n-1, from, work, to);
        moveOne(from, to);
        hanoi(n-1, work, to, from);
    }

    public static void main(String args[] ) {
        int n = 4;
        System.out.println(n);

        initialize(n);
        hanoi(n, 0, 2, 1);
        System.out.println(count);
    }
}
