package FlipperElements;

import Visitor.Visitor;

public class BumperAdapter extends FlipperElement {
    private final Bumper bumper;

    public BumperAdapter(Bumper bumper) {
        this.bumper = bumper;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void hit() {
        bumper.bump();
    }

    public int getHits(){
        return bumper.bumps;
    }

    public void resetHits() {
        bumper.bumps = 0;
    }
}