package Display.FontFamilyBProducts;

import Display.DisplayMessage;

public class FontFamilyBCoinMessage implements DisplayMessage {
    int coins;

    public FontFamilyBCoinMessage(int coins) {
        this.coins = coins;
    }

    public void display() {
        if(coins > 0) {
            System.out.println("   ______      _           \n" +
                    "  / ____/___  (_)___  _____\n" +
                    " / /   / __ \\/ / __ \\/ ___/\n" +
                    "/ /___/ /_/ / / / / (__  ) \n" +
                    "\\____/\\____/_/_/ /_/____/  \n" +
                    "                           ");

            switch (coins) {
                case 0:
                    System.out.println("   ____ \n" +
                            "  / __ \\\n" +
                            " / / / /\n" +
                            "/ /_/ / \n" +
                            "\\____/  \n" +
                            "        ");
                    break;
                case 1:
                    System.out.println("   ___\n" +
                            "  <  /\n" +
                            "  / / \n" +
                            " / /  \n" +
                            "/_/   \n" +
                            "      ");
                    break;
                case 2:
                    System.out.println("   ___ \n" +
                            "  |__ \\\n" +
                            "  __/ /\n" +
                            " / __/ \n" +
                            "/____/ \n" +
                            "       ");
                    break;
                case 3:
                    System.out.println("   _____\n" +
                            "  |__  /\n" +
                            "   /_ < \n" +
                            " ___/ / \n" +
                            "/____/  \n" +
                            "        ");
                    break;
                case 4:
                    System.out.println("   __ __\n" +
                            "  / // /\n" +
                            " / // /_\n" +
                            "/__  __/\n" +
                            "  /_/   \n" +
                            "        ");
                    break;
                case 5:
                    System.out.println("    ______\n" +
                            "   / ____/\n" +
                            "  /___ \\  \n" +
                            " ____/ /  \n" +
                            "/_____/   \n" +
                            "          ");
                    break;
                case 6:
                    System.out.println("   _____\n" +
                            "  / ___/\n" +
                            " / __ \\ \n" +
                            "/ /_/ / \n" +
                            "\\____/  \n" +
                            "        ");
                    break;
                case 7:
                    System.out.println(" _____\n" +
                            "/__  /\n" +
                            "  / / \n" +
                            " / /  \n" +
                            "/_/   \n" +
                            "      ");
                    break;
                case 8:
                    System.out.println("   ____ \n" +
                            "  ( __ )\n" +
                            " / __  |\n" +
                            "/ /_/ / \n" +
                            "\\____/  \n" +
                            "        ");
                    break;
                case 9:
                    System.out.println("   ____ \n" +
                            "  / __ \\\n" +
                            " / /_/ /\n" +
                            " \\__, / \n" +
                            "/____/  \n" +
                            "        ");
                    break;
            }
        }
        else System.out.println("    _   __         ______              ___ __ \n" +
                "   / | / /___     / ____/_______  ____/ (_) /_\n" +
                "  /  |/ / __ \\   / /   / ___/ _ \\/ __  / / __/\n" +
                " / /|  / /_/ /  / /___/ /  /  __/ /_/ / / /_  \n" +
                "/_/ |_/\\____/   \\____/_/   \\___/\\__,_/_/\\__/  \n" +
                "                                              ");
    }
}
