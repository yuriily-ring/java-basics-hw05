public class Penguin extends NonFlyingBird {
    @Override
    public String toString() {
        return this.getClass().getCanonicalName();
    }
}
