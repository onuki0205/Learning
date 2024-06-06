/**
直角三角形の斜辺の長さを求めてください。
残りの2辺は、aとbとし、a = 3、bは１から10まで増えていきます。

ピタゴラスの定理では、直角三角形の斜辺の長さは、次の式で求めます。

(斜辺の長さ) = √(a2 + b2)
**/

//ピタゴラスの定理
public class Main {
    public static void main(String[] args) throws Exception {
        int number = 10;
        for (int i = 1; i <= number; i++) {
            System.out.println(i + ": " + pythagorean(3, i));
        }
    }
    public static double pythagorean(int a, int b) {
        // sqrt(a^2 + b^2)
        return Math.sqrt(a*a+b*b); // ここに計算式を記述する
    }
}
