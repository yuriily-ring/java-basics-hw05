public abstract class NonFlyingBird extends Bird {
    @Override
    public String toString() {
//        System.out.println(this.getClass().getCanonicalName());
        return this.getClass().getCanonicalName();
    }
}
