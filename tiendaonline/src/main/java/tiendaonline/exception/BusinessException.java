package tiendaonline.exception;

/**
 * The Class BusinessException.
 */

public class BusinessException extends Exception {
  
  /** Id de version utilizado para la serializacion del objeto. */
  private static final long serialVersionUID = 1L;
  
  /**
   * Excepcion de negocio
   *
   * @param e Excepcion original que origino el error
   */
  public BusinessException(Exception e) {
    super();
  }

    /**
     * Excepcion de negocio
     *
     * @param message Mensaje de error
     */
  public BusinessException(String message) {
    super(message);
  }

  /**
   * Excepcion de negocio
   *
   * @param message Mensaje de error
   * @param e Excepcion original que origino el error
   */
  public BusinessException(String message, Exception e) {
    super(message);
  }

  /**
   * Excepcion de negocio
   *
   * @param message Mensaje de error
   * @param cause Objeto de tipo Throwable con la causa del error
   * @param e Excepcion original que origino el error
   */
  public BusinessException(String message, Throwable cause, Exception e) {
    super(message, cause);
  }

  /**
   * Excepcion de negocio
   *
   * @param cause Objeto de tipo Throwable con la causa del error
   * @param e Excepcion original que origino el error
   */
  public BusinessException(Throwable cause, Exception e) {
    super(cause);
  }
}
