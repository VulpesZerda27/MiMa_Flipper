package FlipperElements;

public class Target implements FlipperElement{
    boolean isActive;
    @Override
    public void hit() {
    }

    @Override
    public void toggle() {
        isActive = !isActive;
    }
}
