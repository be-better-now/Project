/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duynh.registration;

import java.io.Serializable;

/**
 *
 * @author MSI
 */
public class RegistrationCreateError implements Serializable {
    private String usernameLengthError;
    private String passwordLengthError;
    private String fullNameLengthError;
    private String confirmNotMatched;
    private String usernameIsExisted;

    public RegistrationCreateError() {
    }

    /**
     * @return the usernameLengthError
     */
    public String getUsernameLengthError() {
        return usernameLengthError;
    }

    /**
     * @param usernameLengthError the usernameLengthError to set
     */
    public void setUsernameLengthError(String usernameLengthError) {
        this.usernameLengthError = usernameLengthError;
    }

    /**
     * @return the passwordLengthError
     */
    public String getPasswordLengthError() {
        return passwordLengthError;
    }

    /**
     * @param passwordLengthError the passwordLengthError to set
     */
    public void setPasswordLengthError(String passwordLengthError) {
        this.passwordLengthError = passwordLengthError;
    }

    /**
     * @return the fullNameLengthError
     */
    public String getFullNameLengthError() {
        return fullNameLengthError;
    }

    /**
     * @param fullNameLengthError the fullNameLengthError to set
     */
    public void setFullNameLengthError(String fullNameLengthError) {
        this.fullNameLengthError = fullNameLengthError;
    }

    /**
     * @return the confirmNotMatched
     */
    public String getConfirmNotMatched() {
        return confirmNotMatched;
    }

    /**
     * @param confirmNotMatched the confirmNotMatched to set
     */
    public void setConfirmNotMatched(String confirmNotMatched) {
        this.confirmNotMatched = confirmNotMatched;
    }

    /**
     * @return the usernameIsExisted
     */
    public String getUsernameIsExisted() {
        return usernameIsExisted;
    }

    /**
     * @param usernameIsExisted the usernameIsExisted to set
     */
    public void setUsernameIsExisted(String usernameIsExisted) {
        this.usernameIsExisted = usernameIsExisted;
    }
    
    
}
