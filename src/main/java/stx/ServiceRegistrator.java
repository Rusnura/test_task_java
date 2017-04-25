package stx;

public class ServiceRegistrator {

  public <T> boolean containsService(Class<T> clazz) {
    // TODO: implementation here
    return true;
  }

  public <T> T getService(Class<T> clazz) throws ServiceException {
    // TODO: implementation here
    return null;
  }

  public <T> void registerService(Class<T> clazz, String className) throws ServiceException {
    // TODO: implementation here
  }

  public <T> void registerService(Class<T> clazz, Class<? extends T> impl) throws ServiceException {
    // TODO: implementation here
  }

  public <T> void registerService(Class<T> clazz, T impl) throws ServiceException {
    // TODO: implementation here
  }

  public <T> void unregisterService(Class<T> clazz) throws ServiceException {
    // TODO: implementation here
  }
}
