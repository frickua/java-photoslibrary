package com.google.photos.library.v1.util;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class StringUtilTest {

  @Test
  public void join() {
    String[] array = new String[] {"a", "b", "c", "d", "e", "f"};
    String joinedStr = StringUtil.join(",", array);
    assertEquals("a,b,c,d,e,f", joinedStr);
  }

  @Test
  public void joinIterable() {
    String[] array = new String[] {"a", "b", "c", "d", "e", "f"};
    String joinedStr = StringUtil.join(",", Arrays.asList(array));
    assertEquals("a,b,c,d,e,f", joinedStr);
  }
}
