/**
HTMLの箇条書きで1から3まで表示するプログラムです。
for命令を使って、箇条書きで1から100まで出力するよう修正してください。
**/
// HTMLによる箇条書き
public class Main {
    public static void main(String[] args) {
        System.out.println("<ul>");
        for(int i = 1; i <= 100; i++) System.out.println("<li>"+i+"</li>");
        System.out.println("</ul>");
    }
}
