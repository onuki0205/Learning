/**
画像用配列playerImagesとキャラクター配置用の配列characterMapが定義されており、HTMLとしてcharacterMapの値を出力します。
このコードを修正して、characterMapの値をインデックスとして、playerImagesで画像を出力してください。
**/

// 2次元配列で画像を表示する

public class Main {
    public static void main(String[] args) {

        //画像URL用の配列
        String[] playerImages = {
            "https://paiza-webapp.s3.amazonaws.com/files/learning/rpg/Empty.png",
            "https://paiza-webapp.s3.amazonaws.com/files/learning/rpg/Dragon.png",
            "https://paiza-webapp.s3.amazonaws.com/files/learning/rpg/Crystal.png",
            "https://paiza-webapp.s3.amazonaws.com/files/learning/rpg/Hero.png",
            "https://paiza-webapp.s3.amazonaws.com/files/learning/rpg/Heroine.png"};

        //キャラクター配置用の配列
        int[][] characterMap = {{1,1,1,1,1},
                                {2,3,3,3,2},
                                {2,4,4,4,2}};

        System.out.println("<table>");
        for (int[] line: characterMap) {
            System.out.println("<tr>");
            for (int imageId: line) {
                System.out.print("<td><img src='" + playerImages[imageId] + "'></td>");System.out.print("<td>" + imageId + "></td>");
            }
            System.out.println("</tr>");
        }
        System.out.println("</table>");
    }
}
