package FlipperElements;

import Visitor.Visitor;

public class ToggleTarget extends FlipperElement{
    public boolean isActive;
    public boolean isHit;
    public void hit() {
        if(isActive) isHit = true;
    }

    @Override
    public void accept(Visitor visitor) {

    }
}