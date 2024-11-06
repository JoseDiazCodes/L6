package frequency;

import java.util.HashMap;
import java.util.Map;

public class Analytics {
  public static Map<String, Double> wordFrequency(String message) {

    // handle null or empty strings

    if (message == null || message.isEmpty()) {
      return null;
    }

    // creates a new hashmap called freqMap
    Map<String, Double> freqMap = new HashMap<>();

    // splits the string into an array of words using empty space or punctuation as a delimiter
    String[] arrayOfWords = message.split("\\W+");
    // stores total amount of words in the array
    double totalWords = arrayOfWords.length;

    // loops through each word in array of words.
    for (String word : arrayOfWords) {
      // stores the uppercase version of our word to use as key in map
      String upperWord = word.toUpperCase();
      // looks for key if it exists add 1 if not initialize the value of the key to 1
      // then we divide by total words to get the average.
      freqMap.put(upperWord,
              freqMap.getOrDefault(upperWord, 0.00 ) + 1.0);
    }

    // fixing rounding issues by making sure that the values have the correct decimal places.
    for (Map.Entry<String, Double> entry : freqMap.entrySet()) {
      freqMap.put(entry.getKey(), Math.round(entry.getValue() / totalWords * 1000.0) / 1000.0);
    }

    return freqMap;
  }
}
