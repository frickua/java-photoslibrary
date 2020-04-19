package com.google.photos.library.v1.util;

import java.util.Iterator;

public class StringUtil {

  public static String join(String delimiter, String... elements) {
    StringBuilder resultBuilder = new StringBuilder();
    resultBuilder.append(elements[0]);
    for (int i = 1; i < elements.length; i++) {
      resultBuilder.append(delimiter);
      resultBuilder.append(elements[i]);
    }
    return resultBuilder.toString();
  }

  public static String join(String delimiter, Iterable<String> elements) {
    StringBuilder resultBuilder = new StringBuilder();
    Iterator<String> elementsIterator = elements.iterator();
    resultBuilder.append(elementsIterator.next());
    while (elementsIterator.hasNext()) {
      resultBuilder.append(delimiter);
      resultBuilder.append(elementsIterator.next());
    }
    return resultBuilder.toString();
  }
}
