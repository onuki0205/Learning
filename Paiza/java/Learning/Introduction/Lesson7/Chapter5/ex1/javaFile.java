/**
学生の国語と算数のテストの点数を保持するクラスで、テストの合計点数を計算するsum()メソッドを持っています。

このクラスを使って、次の学生のオブジェクトを作成し、合計点数の計算結果を表示してください。
出力形式のXXXのところに、合計点数が入ります。

国語 = 70点
算数 = 43点

出力形式： 合計はXXX点です
**/

// 学生メソッドを呼び出す

public class Main {
    public static void main(String[] args) {
        // この下に、インスタンスを実体化し、メソッド呼び出しを記述する
        Gakusei man = new Gakusei(70,43);
        System.out.println("合計は"+man.sum()+"点です");

        System.out.println("合計は100点です");
    }
}

class Gakusei {
    private int myKokugo;
    private int mySansu;

    public Gakusei(int kokugo, int sansu) {
        myKokugo = kokugo;
        mySansu = sansu;
    }

    public int sum() {
        return myKokugo + mySansu;
    }
}
