package com.cab.service;

import com.cab.exceptions.LogInException;
import com.cab.model.Customer;
import com.cab.model.UserLogin;


public interface LoginService {

    public String login (UserLogin userLogin) throws LogInException;

    public String logout (String Key) throws LogInException;

}
