package C2.Exception;

/*
* Validation using checked exception
*/
public class ValidationUsingChecked {
    public static void validateLogin(LoginRequest loginRequest) throws ExceptionChecked {
        if (loginRequest.username == "" || loginRequest.password == "") {
            throw new ExceptionChecked("username OR password is blank");
        }
        else if(loginRequest.username == null || loginRequest.password == null) {
            throw new NullPointerException("username OR password is null");
        }
    }
}
