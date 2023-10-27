package Display.FontFamilyBProducts;

import Display.DisplayMessage;

public class FontFamilyBScoreMessage implements DisplayMessage {
        int score;

        public FontFamilyBScoreMessage(int score) {
            this.score = score;
        }

        public void display() {
            System.out.println("   _____                    \n" +
                    "  / ___/_________  ________ \n" +
                    "  \\__ \\/ ___/ __ \\/ ___/ _ \\\n" +
                    " ___/ / /__/ /_/ / /  /  __/\n" +
                    "/____/\\___/\\____/_/   \\___/ \n" +
                    "                            ");
            System.out.println(score);
        }
    }
