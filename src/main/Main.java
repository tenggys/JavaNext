import chars.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static final  int GABG_SIZE = 5;

    public static List<Base> whiteSide;

    public static List<Base> darkSide;

    public static void main(String[] args) {
        init();

        Scanner = new Scanner(System.in);

        while (true){
            ConsoleView.view();
            turnMove();
            scanner.nextLine();
        }
    }

    private  static void turnMove(){
        List<Unit> sortSide = new ArrayList<>();
        sortSide.addAll(blueSide);
        sortSide.addAll(greenSide);
        sortSide.sotr(new Comporator<Unit>(){
            public int compare(Unit o1, Unit o2){
                int tmp = o2.getSpeed() - o1.getSpeed();
                return tmp;
            }
        });
        sortSide.forEach(Unit::step);
    }

    private static void init(){
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();

        int x =1 ;
        int y = 1;
        for (int i = 0; i < GABG_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0: whiteSide.add(new Peasant(whiteSide, darkSide, x, y++));break;
                case 1: whiteSide.add(new Robber(whiteSide, darkSide, x, y++));break;
                case 2: whiteSide.add(new Sniper(whiteSide, darkSide, x, y++));break;
                    default: whiteSide.add(new Monk(whiteSide, darkSide, x, y++));break;
            }

            x = 10;
            y = 1;
            for (int i = 0; i < GABG_SIZE; i++){
                switch (new Random().nextInt(4)){
                    case 0: darkSide.add(new Peasant(darkSide, whiteSide, x, y++));break;
                    case 1: darkSide.add(new Spearman(darkSide, whiteSide, x, y++));break;
                    case 2: darkSide.add(new Xbowman(darkSide, whiteSide, x, y++));break;
                    default: darkSide.add(new Wizard(darkSide, whiteSide, x, y++));break;
                }
            }
        }
    }

//    class Foo extends Vector2 {
//        public Foo(int x, int y) {
//            super(x, y);
//        }

//        private void f () {
//            Foo foo = new Foo(1, 2);
//            foo.
//        }
//    }
}