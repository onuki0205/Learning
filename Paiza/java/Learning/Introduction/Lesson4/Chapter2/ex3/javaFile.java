// 変数で、配列に代入する

public class Main {
    public static void main(String[] args) {
        String player_1 = "勇者";
        String player_2 = "魔法使い";
        String player_3 = "戦士";
        // player_1 ~ 3を、配列に代入して、printlnメソッドで出力してください。
        String[] array = {player_1,player_2,player_3};
        // この下で、arrayを出力してみよう
        for(int i = 0; i < array.length; i++){
          System.out.println(array[i]);
        }

    }
}
