package projectjava.bindingModel;

import javax.validation.constraints.NotNull;

/**
 * Created by user on 12/6/2016.
 */
public class UserBindingModel {
    @NotNull
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @NotNull

    private String fullName;

    @NotNull
    private String password;

    @NotNull
    private String confirmPassword;
}
