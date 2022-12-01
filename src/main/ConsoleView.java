import chars.Vector2;

public class ConsoleView {

    private static int step = 0;
    private static final String top10 = fornatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("-b")))+formatDiv("-c"));
    private static final String mid10 = fornatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("-e")))+formatDiv("-f"));
    private static final String bottom10 = fornatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("-h")))+formatDiv("-i"));

    public static view(){
        if (step == 1) {
            System.out.println(AnsiColors.ANS_RED+"First step.2"+AnsiColors.ANSI_RESET);
        } else {
            System.out.println(AnsiColors.ANS_RED+"Step #" + step++ +"."+AnsiColors.ANSI_RESET);
        }
        step++;

        System.out.prinln(ConsoleVies.top10);

        for (int i = 1; i <= Main.GANG_SIZE-1; i++) {
            for (int j = 1; j <= Main.GANG_SIZE; i++) {
                System.out.print(getChar(new Vector2(j, i)));
            }
            System.out.println("|");
            System.out.prinln(ConsoleVies.mid10);
        }

        for (int j = 0; j <= Main.GANG_SIZE; i++) {
            System.out.print(getChar(new Vector2(j, 10));
        }
        System.out.println("|");
        System.out.prinln(ConsoleVies.bottom10);
        System.out.println("Press Enter.");
    }

    private static Sting fromDiv(String str) {
        return  str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500')
                .replace('S', "...")
                .replace('O', "---");
    }

    private static String getChar(Vector2 position){
        String str = "| ";
        for (int i = 0; i < Main.GANG_SIZE; i++){
            if (Main.darkSide.get(i).getPosition(position)) str = "|"+AnsiColors.ANSI_BLUE + Main.darkSide.get(i).getName().toUpperCase().charAt(0) + AnsiColors.ANSI_REST;
            if (Main.whiteSide.get(i).getPosition(position)) str = "|"+AnsiColors.ANSI_GREEN + Main.whiteSide.get(i).getName().toUpperCase().charAt(0) + AnsiColors.ANSI_REST;
        }
        return str;
    }
}



