/**
ハノイの塔で、円盤10枚を0番の杭から2番の杭に1回移動した状態を出力したいのですが、mainメソッドに間違いがあって正常に動作しません。このコードを修正して、正しい状態を出力してください。
**/

// ハノイの塔の解説 - 円盤を1つ移動する
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

    public static void main(String args[] ) {
        int n =10;
        System.out.println(n);

		initialize(n);
		printPiles();
		moveOne(0, 2);
		printPiles();
    }
}
