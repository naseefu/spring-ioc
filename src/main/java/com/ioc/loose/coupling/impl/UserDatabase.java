package com.ioc.loose.coupling.impl;

import com.ioc.loose.coupling.UserDataProvider;

public class UserDatabase implements UserDataProvider {

    // this annotation is optional
    @Override
    public String getUserDetails(){
        // Directly access database here
        return "User Details From Database";
    }

}
