/**
n　（n 訪問点の数）
x_1 y_1　（x_1 は 訪問点の x 座標、 y_1 巡回ポイントの y 座標）
x_2 y_2　（x_2 は 訪問点の x 座標、 y_2 巡回ポイントの y 座標）
・・・
x_n y_n　（x_n は 訪問点 x 座標、 y_n 巡回ポイントの y 座標）

与えられた座標を、入力された順にpointオブジェクトに格納してください。
**/

import java.util.*;
import java.awt.Point;

class Main {
    // 経路の表示
    static void info(int n, List<Point> route) {
        for (int i=0; i<n; i++) {
            System.out.println(route.get(i).x + " " + route.get(i).y);
        }
    }

    public static void main(String[] args) {
        // 入力処理
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0)); // 最初の点として(0, 0)を追加
        // ここにコードを記入
        for (int i = 0; i < n; i++) {
          points.add(new Point(scanner.nextInt(), scanner.nextInt()));
        }
        // 経路を表示する
        info(n+1, points);
    }
}
