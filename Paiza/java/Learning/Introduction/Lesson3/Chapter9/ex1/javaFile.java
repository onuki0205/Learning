/**
西暦年と昭和年の対応表を作成してください。対応表は、「西暦X年は昭和Y年です」と表示します。なお、昭和年は、西暦1926年から西暦1988年までの期間で、「西暦年 - 1925」で求めることができます。
**/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int seireki, shouwa;
        for(seireki = 1926; seireki <= 1988; seireki++){
          System.out.print("西暦"+seireki+"年は");
          shouwa = seireki - 1925;
          System.out.println("昭和"+shouaw+"年です");
        }
    }
}
