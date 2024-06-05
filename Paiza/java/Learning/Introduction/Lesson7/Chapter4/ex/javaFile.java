/**
RPGの攻撃シーンを表示するプログラムで、teamのメンバーが順番にattackメソッドを呼び出します。
下記の期待する出力値が出力されるように、右のコードの足りない部分を補ってください。
**/

// RPGの攻撃シーン
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> team = new ArrayList<Player>();
        team.add(new Player("勇者"));
        team.add(new Player("戦士"));
        team.add(new Player("魔法使い"));

        for (Player person : team) {
            person.attack("スライム");
        }
    }
}

class Player {
    private String myName;

    public Player(String name) {
        myName = name;
    }

    public void attack(String enemy) {
	    System.out.println(myName + "は" + enemy + "を攻撃した");
    }
}
