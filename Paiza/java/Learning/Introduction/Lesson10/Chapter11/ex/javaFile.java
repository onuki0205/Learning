/**
ファイルに0から99まで1行ずつ書き込んで表示するプログラムですが、コンパイルエラーになってしまいます。コードを修正して、プログラムを完成させてください。
**/

// 0から99までファイルに書き込む
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        File file = new File("articles.txt");

        // ファイル書き込み
        FileWriter filewriter = new FileWriter(file);
        for (int i = 0; i < 100; i++){
            filewriter.write(i + "\n");
        }
        filewriter.close();

        // ファイル読み込み
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
        }
        scan.close();
    }
}
