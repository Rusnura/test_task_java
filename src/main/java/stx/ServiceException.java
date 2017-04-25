package stx;

public class ServiceException extends Exception {

  public ServiceException(String message)
  {
    this(message, null);
  }
  public ServiceException(String message, Throwable ex)
  {
    super(message, ex);
  }
}
