/**
2次元配列を使って、縦に5個、横に10個の「.」を四角く出力します。
このコードを修正して、四角の4つのコーナーに「.」の代わりに「+」を出力してください。
**/

// 模様を出力してみよう
public class Main {
    public static void main(String[] args) {
        String[][] areaMap = new String[5][10];
        // この下で、2次元配列の初期値を設定する
        areaMap[0][0] = areaMap [0][9] = areaMap[4][0] = areaMap [4][9] = "+";
        for (int i = 0; i < areaMap.length; i++) {
            for (int j = 0; j < areaMap[i].length; j++) {
                if (areaMap[i][j] == null) {
                    areaMap[i][j] = ".";
                }
                System.out.print(areaMap[i][j]);
            }
            System.out.println("");
        }
    }
}
