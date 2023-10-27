import Commands.*;
import Display.DisplayFactory;
import Display.FontFamilyAFactory;
import Display.FontFamilyBFactory;
import FlipperElements.*;
import Mediator.RampTargetMediator;
import Visitor.BallVisitor;
import Visitor.ResetVisitor;
import Visitor.ScoreVisitor;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Choose the FontFamily
        System.out.println("Choose the font family: \n1. FontFamilyA \n2. FontFamilyB");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        DisplayFactory factory = choice == 1 ? new FontFamilyAFactory() : new FontFamilyBFactory();

        // Initialize necessary Elements
        ScoreVisitor scoreVisitor = new ScoreVisitor();
        ResetVisitor resetVisitor = new ResetVisitor();
        BallVisitor ballVisitor = new BallVisitor();

        Ramp ramp = new Ramp();
        BumperAdapter bumperAdapter = new BumperAdapter(new Bumper());
        ArrayList<ToggleTarget> targetList = new ArrayList<>();

        for(int i = 0; i<3; i++){
            targetList.add(new ToggleTarget());
        }

        RampTargetMediator rampTargetMediator = new RampTargetMediator(ramp, targetList);

        ArrayList<Visitable> flipperElements = new ArrayList<>();
        flipperElements.add(ramp);
        flipperElements.add(bumperAdapter);
        flipperElements.add(rampTargetMediator);

        // Initialize the Flipper
        Flipper flipper = Flipper.getInstance(factory, flipperElements);

        // Initialize basic commands
        BumperHitCommand bumperHitCommand = new BumperHitCommand(bumperAdapter);
        RampHitCommand rampHitCommand = new RampHitCommand(rampTargetMediator);
        ActiveCheckCommand activeCheckCommand = new ActiveCheckCommand(rampTargetMediator);
        RandomTargetHitCommand randomTargetHitCommand = new RandomTargetHitCommand(rampTargetMediator);

        CompositeCommand targetHitCommand = new CompositeCommand();
        targetHitCommand.add(activeCheckCommand);
        targetHitCommand.add(randomTargetHitCommand);

        // Composite Command to simulate game events
        List<Command> gameCommands = Arrays.asList(bumperHitCommand, rampHitCommand, targetHitCommand);

        boolean gameStarted = false;
        while (!gameStarted) {
            System.out.println("Press 1 to insert a coin or 2 to press start.");
            int input = scanner.nextInt();
            scanner.nextLine();
            if (input == 1) {
                flipper.insertCoin();
            } else if (input == 2) {
                gameStarted = flipper.pressStart();
            }
        }

        Random rand = new Random();
        for (int j = 0; j < 4; j++) {
            pressAnyKeyToResume(scanner);
            flipper.accept(ballVisitor);

            int actions = rand.nextInt(6) + 4;
            for (int i = 0; i < actions; i++) {
                System.out.println("Choose an action: \n1. Hit Bumper \n2. Hit Ramp \n3. Hit Random Target");
                int action = scanner.nextInt();
                scanner.nextLine();
                gameCommands.get(action - 1).execute();
            }

            flipper.accept(scoreVisitor);
            flipper.accept(resetVisitor);
        }
    }

    public static void pressAnyKeyToResume(Scanner scanner){
        System.out.println("Press any key to continue");
        scanner.nextLine();
    }
}
