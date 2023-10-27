package Display.FontFamilyAProducts;

import Display.DisplayMessage;

public class FontFamilyABallMessage implements DisplayMessage {
    int ballNumber;

    public FontFamilyABallMessage(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public void display() {
        System.out.println("______       _ _       _       __ _     \n" +
                "| ___ \\     | | |     | |     / _| |  _ \n" +
                "| |_/ / __ _| | |___  | | ___| |_| |_(_)\n" +
                "| ___ \\/ _` | | / __| | |/ _ \\  _| __|  \n" +
                "| |_/ / (_| | | \\__ \\ | |  __/ | | |_ _ \n" +
                "\\____/ \\__,_|_|_|___/ |_|\\___|_|  \\__(_)\n" +
                "                                        ");

        switch (ballNumber){
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
}