package stx;

import org.junit.Test;
import stx.impl.I4Impl;
import stx.impl.I5Impl;
import stx.interfaces.I4;
import stx.interfaces.I5;

public class ServiceRegistratorDependencies {

  @Test
  public void registerFine() throws ServiceException {
    ServiceRegistrator services = new ServiceRegistrator();
    services.registerService(I4.class, new I4Impl());
    services.registerService(I5.class, new I5Impl());
  }

  @Test(expected = ServiceException.class)
  public void faildeDependency() throws ServiceException {
    ServiceRegistrator services = new ServiceRegistrator();
    services.registerService(I5.class, new I5Impl());
  }
}
