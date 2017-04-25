package stx.impl;

import stx.interfaces.I4;
import stx.interfaces.I5;
import stx.interfaces.IServiceDependencies;

public class I5Impl implements I5, IServiceDependencies {
  @Override
  public Class<?>[] getDependencies() {
    return new Class[] { I4.class };
  }
}
