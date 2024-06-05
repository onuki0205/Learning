// 標準入力とループ処理
import java.util.*;

public class Main {
    public static void main(String[] args) {
      int i,j;
      Scanner sc = new Scanner(System.in);
      i = sc.nextInt();
      j = sc.nextInt();
      while(i<=j){
        System.out.println(i);
        i++;
      }
    }
}
