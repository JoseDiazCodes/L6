package doubledispatch;

/**
 * Represents the planet Mercury in the space exploration simulation.
 * Implements IPlanet interface to participate in the double-dispatch pattern.
 * Allows different types of explorers to visit and study Mercury.
 */
public class Mercury implements IPlanet {

  /**
   * Accepts a visit from a space explorer using double-dispatch.
   * Calls back to the explorer's appropriate visit method for Mercury.
   *
   * @param explorer The space explorer visiting Mercury
   */
  @Override
  public void accept(ISpaceExplorer explorer) {
    explorer.visit(this);
  }
}