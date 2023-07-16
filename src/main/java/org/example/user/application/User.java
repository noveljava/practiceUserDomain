package org.example.user.application;

import org.example.user.application.state.States;

import java.net.http.HttpClient;

public class User {
    private Long id;
    private String name;
    private String phoneNumber;
    private DriverLicense driverLicense;
    private States state;

    public boolean canRentCar() {
        if (state.needsCheckDrivingLicense()) {
            checkDrivingLicense();
        }

        state.needsCheckSelfie();

        if (!state.canRentCar()) {
            throw new IllegalStateException("User cannot rent a car");
        }

        return state.canRentCar();
    }

    private boolean checkDrivingLicense() {
        // interface...
    }

}
