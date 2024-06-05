/**
あなたは梅雨入りを判定するプログラムを開発することにしました。
梅雨の基準は明確に決まっていませんがひとまず 7日間のうちいずれかの 4 日以上雨が降った場合に梅雨とすることにしました。

天気が晴れの場合 "Sunny" 、雨の場合 "Rain" とし 7 日間の天気が改行区切りで与えられるのでいずれかの 4 日以上雨が降っている場合 "Yes" 、 3 日未満であれば "No" と出力してください。
**/
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for(int i=0; i<7; i++){
          if(sc.next().equals("Rain")) count++;
        }

        if(count>=4) System.out.println("Yes");
        else System.out.println("No");
    }
}
