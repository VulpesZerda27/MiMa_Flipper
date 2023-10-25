package FlipperElements;

import Visitor.Visitor;
import lombok.Data;

public class ToggleTarget extends FlipperElement{
    public boolean isActive;
    public boolean isHit;
    public void hit() {
        isHit = true;
    }
    public void toggle() {
        isActive = !isActive;
    }

    @Override
    public void accept(Visitor visitor) {

    }
}