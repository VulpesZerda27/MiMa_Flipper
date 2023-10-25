package FlipperElements;

import Visitor.Visitor;

public class Ramp extends FlipperElement{
    @Override
    public void accept(Visitor visitor) {
    }

    public boolean isActive;
    public void toggle() {
        isActive = !isActive;
    }
}
