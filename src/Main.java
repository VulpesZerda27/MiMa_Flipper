import Commands.*;
import Display.FontFamilyAFactory;
import FlipperElements.*;
import Mediator.RampTargetMediator;
import Visitor.BallVisitor;
import Visitor.ResetVisitor;
import Visitor.ScoreVisitor;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize necessary Elements
        ScoreVisitor scoreVisitor = new ScoreVisitor();
        ResetVisitor resetVisitor = new ResetVisitor();
        BallVisitor ballVisitor = new BallVisitor();

        Ramp ramp = new Ramp();
        BumperAdapter bumperAdapter = new BumperAdapter(new Bumper());
        ArrayList<ToggleTarget> targetList = new ArrayList<>();

        for(int i = 0; i<5; i++){
            targetList.add(new ToggleTarget());
        }

        RampTargetMediator rampTargetMediator = new RampTargetMediator(ramp, targetList);

        ArrayList<Visitable> flipperElements = new ArrayList<>();
        flipperElements.add(ramp);
        flipperElements.add(bumperAdapter);
        flipperElements.add(rampTargetMediator);

        // Initialize the Flipper
        Flipper flipper = Flipper.getInstance(new FontFamilyAFactory(), flipperElements);

        // Initialize basic commands
        BumperHitCommand bumperHitCommand = new BumperHitCommand(bumperAdapter);
        RampHitCommand rampHitCommand = new RampHitCommand(rampTargetMediator);
        ActiveCheckCommand activeCheckCommand = new ActiveCheckCommand(rampTargetMediator);
        RandomTargetHitCommand randomTargetHitCommand = new RandomTargetHitCommand(rampTargetMediator);

        CompositeCommand targetHitCommand = new CompositeCommand();
        targetHitCommand.add(activeCheckCommand);
        targetHitCommand.add(randomTargetHitCommand);

        // Composite Command to simulate game events
        CompositeCommand someGameEvents = new CompositeCommand();
        someGameEvents.add(bumperHitCommand);
        someGameEvents.add(bumperHitCommand);
        someGameEvents.add(targetHitCommand);
        someGameEvents.add(bumperHitCommand);

        // Simulated game:

        pressAnyKeyToResume(scanner);
        // Try to press start
        flipper.pressStart();

        pressAnyKeyToResume(scanner);
        // Insert coins to start the game
        flipper.insertCoin();
        flipper.insertCoin();
        flipper.pressStart();

        pressAnyKeyToResume(scanner);
        // Ball 1
        flipper.accept(ballVisitor);

        rampHitCommand.execute();

        for(int i = 0; i<6; i++) {
            someGameEvents.execute();
        }

        flipper.accept(scoreVisitor);
        flipper.accept(resetVisitor);

        pressAnyKeyToResume(scanner);
        // Ball 2
        flipper.accept(ballVisitor);

        for(int i = 0; i<7; i++) {
            someGameEvents.execute();
        }

        flipper.accept(scoreVisitor);
        flipper.accept(resetVisitor);

        pressAnyKeyToResume(scanner);
        // Ball 3
        flipper.accept(ballVisitor);

        for(int i = 0; i<3; i++) {
            someGameEvents.execute();
        }

        flipper.accept(scoreVisitor);
        flipper.accept(resetVisitor);

        pressAnyKeyToResume(scanner);
        // Last Ball
        flipper.accept(ballVisitor);

        for(int i = 0; i<1; i++) {
            someGameEvents.execute();
        }

        flipper.accept(scoreVisitor);
        flipper.accept(resetVisitor);
    }

    public static void pressAnyKeyToResume(Scanner scanner){
        System.out.println();
        System.out.println("Press any key to continue");
        scanner.nextLine();
    }
}
