package Display.FontFamilyBProducts;

import Display.DisplayMessage;

public class FontFamilyBBallMessage implements DisplayMessage {
    int ballNumber;

    public FontFamilyBBallMessage(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public void display() {
        System.out.println("    ____        ____        __     ______   \n" +
                "   / __ )____ _/ / /____   / /__  / __/ /__ \n" +
                "  / __  / __ `/ / / ___/  / / _ \\/ /_/ __(_)\n" +
                " / /_/ / /_/ / / (__  )  / /  __/ __/ /__   \n" +
                "/_____/\\__,_/_/_/____/  /_/\\___/_/  \\__(_)  \n" +
                "                                            ");

        switch (ballNumber) {
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
}