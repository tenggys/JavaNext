import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            units.add(getUnit());
        }
        getType(units, type: "Мона");

 //       units.forEach(unit -> System.out.println(unit.toString()));
    }

    private static Unit getUnit () {
        int num = Random().nextInt(7);
        switch (num) {
            0 -> new Peasant(),
            1 -> new Monk(),
            2 -> new Robber(),
            3 -> new Sniper(),
            4 -> new Spearman(),
            5 -> new Wizard(),
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