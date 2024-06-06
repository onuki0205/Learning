/**
ハノイの塔で、円盤枚数と指定回数の状態を出力します。このプログラムを修正して、円盤4枚を10回移動した状態を出力してください。
**/

// ハノイの塔の解説 - 指定ステップの状態を出力 - 再帰あり
import java.util.*;

class Main {
    /*
    piles    :  3本の杭をLinkedListに格納
    名前なし :  杭は、LinkedList。円盤を格納
    名前なし :  円盤は、円盤の大きさを整数で表す。 ex. 4 3 2 1
    */

    static List<LinkedList<Integer>> piles;
    static int count;
    static int target;

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
        if (count == target) {
            printPiles();
            System.exit(0);
        }
    }

    static void hanoi(int n, int from, int to, int work) {
        if (n == 0) {
            return;
        }

        hanoi(n-1, from, work, to);
        moveOne(from, to);
        //printPiles();
        hanoi(n-1, work, to, from);
    }

    public static void main(String args[] ) {
        int n = 4;
        target = 10;
		if (target <= Math.pow(2, n) - 1) {
			System.out.println(n);
		} else {
			System.out.println("Too big:" + (int)(Math.pow(2, n) - 1));
			System.exit(1);
		}

        initialize(n);
        printPiles();
        hanoi(n, 0, 1, 2);
    }
}
