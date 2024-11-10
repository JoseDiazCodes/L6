package doubledispatch;

/**
 * An explorer that specializes in searching for life on different planets.
 * This explorer logs its visits to each planet, indicating life exploration activities.
 * Implements ISpaceExplorer as part of the double-dispatch pattern.
 */
public class LifeExplorer implements ISpaceExplorer {

  /**
   * Visits Mercury to explore for life.
   * Logs the exploration activity to the simulation log.
   *
   * @param mercury The Mercury planet instance being visited
   */
  @Override
  public void visit(Mercury mercury) {
    SimulationBuilder.addToLog("Landing: Mercury -> exploring life");
  }

  /**
   * Visits Mars to explore for life.
   * Logs the exploration activity to the simulation log.
   *
   * @param mars The Mars planet instance being visited
   */
  @Override
  public void visit(Mars mars) {
    SimulationBuilder.addToLog("Landing: Mars -> exploring life");
  }

  /**
   * Visits Venus to explore for life.
   * Logs the exploration activity to the simulation log.
   *
   * @param venus The Venus planet instance being visited
   */
  @Override
  public void visit(Venus venus) {
    SimulationBuilder.addToLog("Landing: Venus -> exploring life");
  }

}