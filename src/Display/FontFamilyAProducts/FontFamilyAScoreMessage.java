package Display.FontFamilyAProducts;

import Display.DisplayMessage;

public class FontFamilyAScoreMessage implements DisplayMessage {
    int score;

    public FontFamilyAScoreMessage(int score) {
        this.score = score;
    }

    public void display() {
        System.out.println(" _____                    \n" +
                "/  ___|                   \n" +
                "\\ `--.  ___ ___  _ __ ___ \n" +
                " `--. \\/ __/ _ \\| '__/ _ \\\n" +
                "/\\__/ / (_| (_) | | |  __/\n" +
                "\\____/ \\___\\___/|_|  \\___|\n" +
                "                          ");
        System.out.println(score);
        System.out.println();
    }
}
