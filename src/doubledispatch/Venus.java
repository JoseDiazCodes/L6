package doubledispatch;

/**
 * Represents the planet Venus in the space exploration simulation.
 * Implements IPlanet interface to participate in the double-dispatch pattern.
 * Allows different types of explorers to visit and study Venus.
 */
public class Venus implements IPlanet {

  /**
   * Accepts a visit from a space explorer using double-dispatch.
   * Calls back to the explorer's appropriate visit method for Venus.
   *
   * @param explorer The space explorer visiting Venus
   */
  @Override
  public void accept(ISpaceExplorer explorer) {
    explorer.visit(this);
  }
}