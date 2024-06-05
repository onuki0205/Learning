/**
whileを使って、20から10までの奇数を一行ずつカウントダウン表示するプログラムを作成してください。
**/
// whileによるループ処理
public class Main {
    public static void main(String[] args) {
        int i = 20;
        while(i>9){
            if(i%2 == 1) System.out.println(i);
            i--;
        }
    }
}
