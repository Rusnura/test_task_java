package stx;

import org.junit.Assert;
import org.junit.Test;
import stx.interfaces.I1;
import stx.interfaces.I2;
import stx.interfaces.I3;

public class ServiceRegistratorTest {
  @Test
  public void registerClassName() throws ServiceException {
    ServiceRegistrator services = new ServiceRegistrator();
    services.registerService(I1.class, "stx.impl.I1Impl");
    Assert.assertTrue(services.containsService(I1.class));
    // TODO: uncomment this code and make it working
    // Assert.assertNotNull(services.getService(I1.class));
    // Assert.assertTrue(services.getService(I1.class) instanceof I1);
    services.unregisterService(I1.class);
    // TODO: Assert.assertFalse(services.containsService(I1.class));
  }

  @Test
  public void registerClass() throws ServiceException {
    ServiceRegistrator services = new ServiceRegistrator();
    services.registerService(I2.class, stx.impl.I2Impl.class);
    Assert.assertTrue(services.containsService(I2.class));

    // TODO: make it working
    Assert.assertNotNull(services.getService(I2.class));
    Assert.assertTrue(services.getService(I2.class) instanceof I2);
    services.unregisterService(I2.class);
    Assert.assertFalse(services.containsService(I2.class));
  }

  @Test
  public void registerClassInstance() throws ServiceException {
    ServiceRegistrator services = new ServiceRegistrator();
    services.registerService(I3.class, new stx.impl.I3Impl());
    Assert.assertTrue(services.containsService(I3.class));

    // TODO: make it working
    Assert.assertNotNull(services.getService(I3.class));
    Assert.assertTrue(services.getService(I3.class) instanceof I3);
    services.unregisterService(I3.class);
    Assert.assertFalse(services.containsService(I3.class));
  }

  @Test(expected = ServiceException.class)
  public void unregisterNotRegisteredService() throws ServiceException {
    ServiceRegistrator services = new ServiceRegistrator();
    // TODO: make it working
    services.unregisterService(I3.class);
  }

  @Test(expected = ServiceException.class)
  public void unregisterClassTwice() throws ServiceException {
    ServiceRegistrator services = new ServiceRegistrator();
    services.registerService(I3.class, new stx.impl.I3Impl());
    services.unregisterService(I3.class);
    // TODO: make it working
    services.unregisterService(I3.class);
  }
}