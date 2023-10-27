package Display.FontFamilyBProducts;

import Display.DisplayMessage;

public class FontFamilyBScoreMessage implements DisplayMessage {
        int score;

        public FontFamilyBScoreMessage(int score) {
            this.score = score;
        }

        public void display() {
            System.out.println("[FontFamilyB] Score: " + score);
        }
    }
