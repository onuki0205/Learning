/**
2次元配列を使って、縦に5個、横に10個の「.」を出力します。
コードを修正して、この2次元配列のインデックスがどちらも2で割り切れる場合は、「.」の代わりに「+」を出力してください。
**/

// 模様を出力してみよう
public class Main {
    public static void main(String[] args) {
        String[][] areaMap = new String[5][10];

        for (int i = 0; i < areaMap.length; i++) {
            for (int j = 0; j < areaMap[i].length; j++) {
                if(i%2==0 && j%2==0) areaMap[i][j] = "+";
                else areaMap[i][j] = ".";
                System.out.print(areaMap[i][j]);
            }
            System.out.println("");
        }
    }
}
