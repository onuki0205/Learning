// 配列の中身を出力してみよう
public class Main {
    public static void main(String[] args) {
        String[][] array = {{"勇者", "忍者"}, {"武士", "戦士"}, {"僧侶", "魔法使い"}};

        // この下で、arrayの全ての要素を出力してみよう
        System.out.println(array[0][0]);
        for(int i = 0;i<3;i++){
          for(int j= 0;j<2;j++){
            System.out.println(array[i][j]);
          }
        }

    }
}
