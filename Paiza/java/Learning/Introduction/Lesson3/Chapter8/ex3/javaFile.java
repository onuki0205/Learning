// 標準入力とループ処理
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int i = sc.nextInt();
      for(int j = 0; j < i; j++) System.out.println(sc.next());
    }
}
