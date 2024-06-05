/**
「A」という文字が、letterAという2次元配列で定義されています。
この配列から要素を順に取り出して、ドットで文字を出力してください。
この時、要素が1だったら「@」(半角アットマーク)、ゼロだったら「 」(半角スペース)を出力します。
**/

// ドットで文字を出力しよう
public class Main {
    public static void main(String[] args) {

        int[][] letterA =
            {{0,0,1,1,0,0},
             {0,1,0,0,1,0},
             {1,0,0,0,0,1},
             {1,1,1,1,1,1},
             {1,0,0,0,0,1},
             {1,0,0,0,0,1}};

        // ここに、ドットを表示するコードを記述する
        for(int[] i:letterA){
          for(int j:i){
            if(j==0) System.out.print(" ");
            else if (j==1) System.out.print("@");
          }
          System.out.println();
        }

    }
}
