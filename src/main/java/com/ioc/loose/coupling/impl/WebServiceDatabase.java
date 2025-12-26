package com.ioc.loose.coupling.impl;

import com.ioc.loose.coupling.UserDataProvider;

public class WebServiceDatabase implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "Web service database";
    }
}
