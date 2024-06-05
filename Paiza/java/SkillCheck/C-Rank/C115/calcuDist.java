import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n-1; i++){
          int a = sc.nextInt();
          if(a <= m) sum += a;
        }

        System.out.println(sum);
    }
}
