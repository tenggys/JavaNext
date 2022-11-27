import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final  int GABG_SIZE = 5;
    public static void main(String[] args) {
        List<Unit> whiteSide = new ArrayList<>();
        List<Unit> blackSide = new ArrayList<>();
        while (whiteSide.size( < GABG_SIZE)) {
            whiteSide.add(getUnit(0, whiteSide));
            blackSide.add(getUnit(3, blackSide));
        }
        whiteSide.forEach(unit -> System.out.println(unit.getInfo()));
        blackSide.forEach(unit -> System.out.println(unit.getInfo()));
        System.out.println();
        whiteSide.forEach(Unit::step);
        blackSide.forEach(Unit::step);
        whiteSide.forEach(unit -> System.out.println(unit.getInfo()));
        blackSide.forEach(unit -> System.out.println(unit.getInfo()));
    }

    private static Unit getUnit(int origing, List<Unit> side) {
        int num = Random().nextInt(origin, origin + 4);
        switch (num) {
            0 -> new Monk(side),
            1 -> new Robber(),
            2 -> new Sniper(),
            3 -> new Peasant(),
            4 -> new Spearman(),
            5 -> new Wizard(side),
            default -> new Xbowman(),
        };
    }

    private static void getType(List<Unit> units, String type) {
        for (Unit unit: units) {
            if (unit.toString().split("")[0].equals(type)) {
                System.out.println(unit)
            }
        }
        Object tmp = new Object();
        tmp.toString();
    }
}