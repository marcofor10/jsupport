package com.github.mforoni.jsupport;

import org.fluttercode.datafactory.impl.DataFactory;

public enum RandomData {
  INSTANCE;
  private final DataFactory dataFactory = new DataFactory();

  public DataFactory get() {
    return dataFactory;
  }
}
