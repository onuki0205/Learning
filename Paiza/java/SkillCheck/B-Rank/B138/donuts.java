import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] str = new String[h];
        int count = 0;


        for(int i=0; i<h; i++)  str[i] = sc.next();

        char[][] map = new char[h][w];
        for(int i=0; i<h; i++){
          for(int j=0; j<w; j++){
            map[i][j] = str[i].charAt(j);
          }
        }

        for(int i=1; i<h-1; i++){
          for(int j=1; j<w-1; j++){
            if(map[i][j]=='.'){

            }
          }
          System.out.println();
        }


        for(int i=1; i<h; i++){
          for(int j=0; j<w; j++){
            System.out.print(map[i][j]);
          }
          System.out.println();
        }
    }

    public static void check(int x,int y){
      point
    }

}
