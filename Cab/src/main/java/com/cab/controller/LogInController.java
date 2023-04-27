package com.cab.controller;

import com.cab.exceptions.LogInException;
import com.cab.model.UserLogin;
import com.cab.service.CustomerService;
import com.cab.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cab")
public class LogInController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private CustomerService customerService;

    /*---------------------------------------------  login  ---------------------------------------------*/
    @PostMapping("/login")
    public ResponseEntity<String> loginMapping(@RequestBody UserLogin userLogin) throws LogInException {

        String output = loginService.login(userLogin);
        return new ResponseEntity<String>(output, HttpStatus.OK);

    }


    /*---------------------------------------------  logout   ---------------------------------------------*/
    @PostMapping("/logout")
    public ResponseEntity<String> logoutMapping(@RequestParam String key) throws LogInException {

        String output = loginService.logout(key);
        return new ResponseEntity<String>(output,HttpStatus.OK);

    }
}
