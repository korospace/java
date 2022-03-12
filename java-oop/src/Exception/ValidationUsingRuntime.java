package Exception;

public class ValidationUsingRuntime {
    public static void validateLogin(LoginRequest loginRequest) {
        if (loginRequest.username=="" || loginRequest.password=="") {
            throw new ExceptionRuntime("username OR password is blank");
        }
        else if(loginRequest.username == null || loginRequest.password == null) {
            throw new NullPointerException("username OR password is null");
        }
    }
}
