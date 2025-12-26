package com.loose.coupling.impl;

import com.loose.coupling.UserDataProvider;

public class WebServiceDatabase implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "Web service database";
    }
}
