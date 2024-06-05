/**
学生の国語と算数のテストの点数を計算するクラスです。メソッドにstaticが付いているので、オブジェクトを実体化しなくても、メソッドを呼び出すことができます。
mainメソッドで、次のテストの点数を使って、sum()メソッドを呼び出し、合計点数の計算結果を表示してください。
出力形式のXXXのところに、合計点数が入ります。

国語 = 70点
算数 = 43点
出力形式： 合計はXXX点です。
**/

// 学生メソッドを呼び出す

public class Main {
    public static void main(String[] args) {
        // この下に、合計得点を戻り値として返すsumメソッドを記述する
        // 国語 = 70点、算数 = 43点
        int total = Gakusei.sum(70, 43);
        System.out.println("合計は" + total + "点です。");
    }
}

class Gakusei {
    // この下に、合計得点を戻り値として返すsumメソッドを記述する
    public static int sum(int kokugo, int sansu){
        return kokugo + sansu;
    }
}
