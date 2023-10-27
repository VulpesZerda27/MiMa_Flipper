package FlipperElements;

import Visitor.Visitor;

public class Ramp extends FlipperElement{
    public boolean isActive;
    public void hit() {
        isActive = !isActive;
    }

    @Override
    public void accept(Visitor visitor) {
    }
}
