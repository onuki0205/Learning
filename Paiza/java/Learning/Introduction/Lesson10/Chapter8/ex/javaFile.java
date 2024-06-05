/**
ファイルを読み書きするプログラムです。これを改良して、0から99まで1行ずつ書き込んで、表示するプログラムを作成してください。

**/

// 0から99までファイルに書き込む
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("articles.txt");

        // ファイル書き込み
        FileWriter filewriter = new FileWriter(file);
        // ここに、0から99まで1行ずつ書き込むコードを記述する
        for (int i = 0; i < 100; i++) {
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
