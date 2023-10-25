package FlipperElements;
import Visitor.Visitor;
public class Bumper extends FlipperElement {
    public int hits;
    public void hit() {
        hits += 1;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
