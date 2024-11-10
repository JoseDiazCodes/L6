package doubledispatch;

/**
 * Represents a space explorer that can visit different types of planets.
 * This interface is part of the double-dispatch pattern for space exploration.
 * Each implementation defines specific behavior for visiting different planet types.
 */
public interface ISpaceExplorer {
  /**
   * Visits the planet Mercury.
   *
   * @param mercury The Mercury planet instance to visit
   */
  void visit(Mercury mercury);

  /**
   * Visits the planet Mars.
   *
   * @param mars The Mars planet instance to visit
   */
  void visit(Mars mars);

  /**
   * Visits the planet Venus.
   *
   * @param venus The Venus planet instance to visit
   */
  void visit(Venus venus);

  /**
   * Default visit method for unknown planet types.
   * Logs a generic message when visiting an unrecognized planet.
   *
   * @param aPlanet The unknown planet instance to visit
   */
  default void visit(IPlanet aPlanet) {
    SimulationBuilder.addToLog("Visiting an unknown planet");
  }
}