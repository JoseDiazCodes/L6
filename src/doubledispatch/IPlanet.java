package doubledispatch;

/**
 * Represents a planet that can be visited by space explorers.
 * This interface is part of the double-dispatch pattern for space exploration.
 */
public interface IPlanet {
  /**
   * Accepts a visit from a space explorer using the double-dispatch pattern.
   * Each planet implementation will call back to the appropriate visit method
   * on the explorer.
   *
   * @param explorer The space explorer visiting this planet
   */
  void accept(ISpaceExplorer explorer);
}