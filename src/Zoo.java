import java.util.ArrayList;
import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type.
   */
  private List<? extends Bird> list = new ArrayList<>();

  public static void feed(List<? extends Bird> list) {
    System.out.println("Feeding birds");
    for (Bird bird : list)
      bird.eat();
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type.
   * @param bird a new bird.
   */
  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {

    System.out.println("Accepting a bird to a section");
    // check flying bird wings
    bird.checkWings();
    // add a bird to the list and print it
    list.add(bird);
    bird.toString();

  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds.
   * @param newBird bird to add.
   */
  public static void registerBird(List<Bird> list, Bird newBird) {

    System.out.println("Adding a bird to the birds list");
    // TODO add a bird to list
    list.add(newBird);
    // TODO print birds in the cycle
    for (Bird bird : list)
      bird.toString();
  }
}