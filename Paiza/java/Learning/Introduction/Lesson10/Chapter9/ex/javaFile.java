/**
ファイルに0から99まで1行ずつ書き込んで表示するプログラムですが、例外処理が不足しているためにコンパイルエラーになってしまいます。これを改良して、プログラムを完成させてください。

**/

// 0から99までファイルに書き込む
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("articles.txt");

        // ファイル書き込み
        try {
            FileWriter filewriter = new FileWriter(file);
            for (int i = 0; i < 100; i++) {
                filewriter.write(i + "\n");
            }
            filewriter.close();
        } catch (IOException e) {
            System.err.println("ファイル書き込みに失敗しました");
            e.printStackTrace();
        }

        // ファイル読み込み
        try {
          Scanner scan = new Scanner(file);
          while (scan.hasNextLine()) {
              String line = scan.nextLine();
              System.out.println(line);
          }
          scan.close();
        } catch (FileNotFoundException e) {
          System.err.println("ファイル読み込みに失敗しました");
          e.printStackTrace();
        }
    }
}
