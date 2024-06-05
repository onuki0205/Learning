/**
学生の国語と算数のテストの点数を保持するクラスです。
このクラスに、テストの合計点数を計算するsum()メソッドを記述してください。
**/

// 学生メソッドを作る

public class Main {
    public static void main(String[] args) {
        Gakusei yamada = new Gakusei(70, 43);
        System.out.println("合計は" + yamada.sum() + "点です");
    }
}

class Gakusei {
    private int myKokugo;
    private int mySansu;

    public Gakusei(int kokugo, int sansu) {
        myKokugo = kokugo;
        mySansu = sansu;
    }

    // この下に、合計得点を戻り値として返すsumメソッドを記述する
    public int sum(){
        return myKokugo + mySansu;
    }
}
