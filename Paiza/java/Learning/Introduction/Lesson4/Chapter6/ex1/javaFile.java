/**
weaponというArrayListが定義されています。
このArrayListに「木の棒」「鉄の剣」「石斧」という要素を追加してください。
**/

// ArrayListに要素を追加する
import java.util.*;

public class Main {
  public static void main(String[] args) {
      ArrayList<String> weapon = new ArrayList<String>();
      // ここに、要素を追加するコードを記述する
      weapon.add("木の棒");
      weapon.add("鉄の剣");
      weapon.add("石斧");
      for (String item : weapon) {
          System.out.println(item);
      }
  }
}
