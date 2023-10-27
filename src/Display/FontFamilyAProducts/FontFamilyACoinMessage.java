package Display.FontFamilyAProducts;

import Display.DisplayMessage;

public class FontFamilyACoinMessage implements DisplayMessage {
    int coins;

    public FontFamilyACoinMessage(int coins) {
        this.coins = coins;
    }

    public void display() {
        if(coins > 0) {
            System.out.println(" _____       _           \n" +
                    "/  __ \\     (_)          \n" +
                    "| /  \\/ ___  _ _ __  ___ \n" +
                    "| |    / _ \\| | '_ \\/ __|\n" +
                    "| \\__/\\ (_) | | | | \\__ \\\n" +
                    " \\____/\\___/|_|_| |_|___/\n" +
                    "                         ");

            switch (coins){
                case 0:
                    System.out.println(" _____ \n" +
                            "|  _  |\n" +
                            "| |/' |\n" +
                            "|  /| |\n" +
                            "\\ |_/ /\n" +
                            " \\___/ \n" +
                            "       ");
                    break;
                case 1:
                    System.out.println(" __  \n" +
                            "/  | \n" +
                            "`| | \n" +
                            " | | \n" +
                            "_| |_\n" +
                            "\\___/\n" +
                            "     ");
                    break;
                case 2:
                    System.out.println(" _____ \n" +
                            "/ __  \\\n" +
                            "`' / /'\n" +
                            "  / /  \n" +
                            "./ /___\n" +
                            "\\_____/\n" +
                            "       ");
                    break;
                case 3:
                    System.out.println(" _____ \n" +
                            "|____ |\n" +
                            "    / /\n" +
                            "    \\ \\\n" +
                            ".___/ /\n" +
                            "\\____/ \n" +
                            "       ");
                    break;
                case 4:
                    System.out.println("   ___ \n" +
                            "  /   |\n" +
                            " / /| |\n" +
                            "/ /_| |\n" +
                            "\\___  |\n" +
                            "    |_/\n" +
                            "       ");
                    break;
                case 5:
                    System.out.println(" _____ \n" +
                            "|  ___|\n" +
                            "|___ \\ \n" +
                            "    \\ \\\n" +
                            "/\\__/ /\n" +
                            "\\____/ \n" +
                            "       ");
                    break;
                case 6:
                    System.out.println("  ____ \n" +
                            " / ___|\n" +
                            "/ /___ \n" +
                            "| ___ \\\n" +
                            "| \\_/ |\n" +
                            "\\_____/\n" +
                            "       ");
                    break;
                case 7:
                    System.out.println(" ______\n" +
                            "|___  /\n" +
                            "   / / \n" +
                            "  / /  \n" +
                            "./ /   \n" +
                            "\\_/    \n" +
                            "       ");
                    break;
                case 8:
                    System.out.println(" _____ \n" +
                            "|  _  |\n" +
                            " \\ V / \n" +
                            " / _ \\ \n" +
                            "| |_| |\n" +
                            "\\_____/\n" +
                            "       ");
                    break;
                case 9:
                    System.out.println(" _____ \n" +
                            "|  _  |\n" +
                            "| |_| |\n" +
                            "\\____ |\n" +
                            ".___/ /\n" +
                            "\\____/ \n" +
                            "       ");
                    break;
            }
        }
        else System.out.println(" _   _         _____              _ _ _   \n" +
                "| \\ | |       /  __ \\            | (_) |  \n" +
                "|  \\| | ___   | /  \\/_ __ ___  __| |_| |_ \n" +
                "| . ` |/ _ \\  | |   | '__/ _ \\/ _` | | __|\n" +
                "| |\\  | (_) | | \\__/\\ | |  __/ (_| | | |_ \n" +
                "\\_| \\_/\\___/   \\____/_|  \\___|\\__,_|_|\\__|\n" +
                "                                          ");
    }
}
