package doubledispatch;

/**
 * Represents the planet Mars in the space exploration simulation.
 * Implements IPlanet interface to participate in the double-dispatch pattern.
 * Allows different types of explorers to visit and study Mars.
 */
public class Mars implements IPlanet {

  /**
   * Accepts a visit from a space explorer using double-dispatch.
   * Calls back to the explorer's appropriate visit method for Mars.
   *
   * @param explorer The space explorer visiting Mars
   */
  @Override
  public void accept(ISpaceExplorer explorer) {
    explorer.visit(this);
  }
}