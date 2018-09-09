package com.acc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyListenerTest {
  @Test
  public void loginTest() {
	  boolean ER=true;
	  boolean AR=true;
	  Assert.assertEquals(ER, AR);
  }
  @Test
  public void RegTest() {
	  boolean ER=true;
	  boolean AR=false;
	  Assert.assertEquals(ER, AR);
  }
}
