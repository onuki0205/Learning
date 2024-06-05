/**
標準入力から、1行目に西暦年、2行目に期間が与えられます。この西暦年から始まる、期間分の「西暦年と昭和年の対応表」を出力するプログラムを作成してください。
対応表の各行は、「西暦X年は昭和Y年です」と表示します。
昭和年は、西暦1926年から西暦1988年までで、「西暦年 - 1925」で求めることができます。
なお。与えられる西暦年は、昭和年に対応しています。上の方法で求めた昭和年は、正しい昭和年(昭和1年から昭和63年)になります。
**/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seireki, shouwa;
        int year = sc.nextInt();
        int s = year + sc.nextInt();
        for(seireki = year; seireki < s; seireki++){
          System.out.print("西暦"+seireki+"年は");
          shouwa = seireki - 1925;
          System.out.println("昭和"+shouwa+"年です");
        }
    }
}
