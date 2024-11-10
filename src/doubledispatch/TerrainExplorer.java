package doubledispatch;

/**
 * An explorer that specializes in mapping the terrain of different planets.
 * This explorer logs its mapping activities for each planet it visits.
 * Implements ISpaceExplorer as part of the double-dispatch pattern.
 */
public class TerrainExplorer implements ISpaceExplorer {

  /**
   * Visits Mercury to map its terrain.
   * Logs the mapping activity to the simulation log.
   *
   * @param mercury The Mercury planet instance being mapped
   */
  @Override
  public void visit(Mercury mercury) {
    SimulationBuilder.addToLog("Mapping: Mercury");
  }

  /**
   * Visits Mars to map its terrain.
   * Logs the mapping activity to the simulation log.
   *
   * @param mars The Mars planet instance being mapped
   */
  @Override
  public void visit(Mars mars) {
    SimulationBuilder.addToLog("Mapping: Mars");
  }

  /**
   * Visits Venus to map its terrain.
   * Logs the mapping activity to the simulation log.
   *
   * @param venus The Venus planet instance being mapped
   */
  @Override
  public void visit(Venus venus) {
    SimulationBuilder.addToLog("Mapping: Venus");
  }
}