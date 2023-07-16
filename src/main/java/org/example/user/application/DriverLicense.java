package org.example.user.application;

public class DriverLicense {
    private final String licenseNumber;

    DriverLicense(String licenseNumber) {
        if (!licenseNumberIsValid()) {
            throw new IllegalArgumentException("Invalid license number");
        }

        this.licenseNumber = licenseNumber;
    }

    private boolean licenseNumberIsValid() {
        return true;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
