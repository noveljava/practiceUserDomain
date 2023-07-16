package org.example.interfaces.application.command;

import org.example.user.application.DriverLicense;

public class Interfaces {
    public boolean checkDriveLicense(DriverLicense driverLicense, String name) {
        return "손용석".equals(name);
    }

    public boolean checkSelfie(String name) {
        return "손용석".equals(name);
    }
}
