package doubledispatch;

import java.util.ArrayList;
import java.util.List;


public class SimulationBuilder {
//  private static final Map<String, Supplier<IPlanet>> planetFactory = new HashMap<>();
//  private static final Map<String, Supplier<ISpaceExplorer>> explorerFactory = new HashMap<>();
  private static final List<String> simLog = new ArrayList<>();

  // adding new planets (original approach)
//  public static void registerPlanet(String name, Supplier<IPlanet> supplier) {
//    planetFactory.put(name.toLowerCase(), supplier);
//  }
//
//  // adding new explorers
//  public static void registerExplorer(String name, Supplier<ISpaceExplorer> supplier) {
//    explorerFactory.put(name.toLowerCase(), supplier);
//  }

  public static IPlanet createPlanet(String name) {
    if (name == null) {
      return null;
    }

    return switch (name.toLowerCase()) {
      case "mars" -> new Mars();
      case "mercury" -> new Mercury();
      case "venus" -> new Venus();
      default -> null;
    };
  }

  public static ISpaceExplorer createExplorer(String name) {
    if (name == null) {
      return null;
    }

    return switch (name.toLowerCase()) {
      case "lifeexplorer" -> new LifeExplorer();
      case "terrainexplorer" -> new TerrainExplorer();
      default -> null;
    };
  }

  public static void addToLog(String message) {
    simLog.add(message);
  }

  public static List<String> getSimulationLog() {
    return new ArrayList<>(simLog);
  }
}