package in.nareshit.raghu.exception;

import java.lang.RuntimeException;
import java.lang.String;

@SuppressWarnings("serial")
public class PatientNotFoundException extends RuntimeException {
  public PatientNotFoundException() {
  }

  public PatientNotFoundException(String message) {
    super(message);
  }
}
