package FlipperElements;

import Visitor.Visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
