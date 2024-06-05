/**
アリスさんはじゃんけんが大好きで、過去に何度も友達のボブさんとじゃんけんを行いました。
手元には、アリスさんとボブさんとの間で、過去に行われたじゃんけんの結果を全て記録したノートがあります。

ノートの記録を元に、過去にアリスさんはボブさんに何回勝ったかを出力するプログラムを作成してください。

例えば入力例 1 の場合、過去にじゃんけんは 6 回行われ、そのうちアリスさんは 3 回勝ち、 1 回あいこ、 2 回負けているので、プログラムでは 3 と一行に出力します。

test
6
G C
C G
P G
G C
P P
P C
out
3
**/
import java.util.*;
public class Main {
    public static void main(String[] args) {
      int count=0;
      String a,b;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for (int i = 0; i<n; i++){
        a = sc.next();
        b = sc.next();
        if ((a.equals("G") && b.equals("C"))||(a.equals("C") && b.equals("P"))||(a.equals("P") && b.equals("G"))) count++;
      }
      System.out.println(count);
    }
}
