/**
ハノイの塔で、2枚の円盤を、0番の杭から2番の杭へ再帰で移動します。このコードを使って、4枚の円盤を0番の杭から1番の杭に、移動する手順を出力してください。
**/

// ハノイの塔の解説 - 再帰で実装する
import java.util.*;

class Main {
    /*
    piles    :  3本の杭をListに格納
    名前なし :  杭は、LinkedList。円盤を格納
    名前なし :  円盤は、円盤の大きさを整数で表す。 ex. 4 3 2 1
    */

    static List<LinkedList<Integer>> piles;

    static void initialize(int n) {
        piles = new LinkedList<>();

        // 3本の杭を作る
        for (int i=0; i<3; i++)
            piles.add(new LinkedList<>());

        // 0番の杭に、n枚の円盤を追加
        for (int i=n; i>=1; i--)
            piles.get(0).add(i);
    }

	static void printPiles() {
		System.out.println("--");

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
	}

	static void hanoi(int n, int from, int to, int work) {
        if (n == 0) {
            return;
        }

        hanoi(n-1, from, work, to);
        moveOne(from, to);
        printPiles();
        hanoi(n-1, work, to, from);
    }

	public static void main(String args[] ) {
		int n = 4;
		System.out.println(n);

		initialize(n);
		printPiles();
	    hanoi(n, 0, 1, 2);
	}
}
