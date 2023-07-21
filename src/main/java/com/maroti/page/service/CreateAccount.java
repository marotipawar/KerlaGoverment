package com.maroti.page.service;

import com.maroti.model.ForgotPassword;
import com.maroti.model.Login;
import com.maroti.model.PersonDetails;
import com.maroti.model.User;

public interface CreateAccount {
    public void personDetails(PersonDetails details);
    public void loginDetails(Login login);
    public void forgotPasswordDetails(ForgotPassword forgotPassword);
}
