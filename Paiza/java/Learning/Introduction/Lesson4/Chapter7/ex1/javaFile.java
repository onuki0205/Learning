/**
team_strという文字列に、RPGのプレイヤーが、カンマで区切られて代入されています。
この文字列を、splitメソッドを使って カンマのところで分割してください。
**/

// 文字列をカンマで分割する

public class Main {
    public static void main(String[] args) {
        String team_str = "勇者,戦士,忍者,魔法使い";
        // ここに文字列を分割するコードを記述する
        String[] team_array = team_str.split(",");
        for (String s : team_array ) {
            System.out.println(s);
        }
    }
}
