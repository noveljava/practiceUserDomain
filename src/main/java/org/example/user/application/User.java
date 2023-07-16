package org.example.user.application;

import lombok.Getter;
import org.example.interfaces.application.command.Interfaces;
import org.example.user.application.state.ActiveState;
import org.example.user.application.state.DormancyState;
import org.example.user.application.state.States;

public class User {
    private Long id;
    @Getter
    private String name;
    private String phoneNumber;
    private DriverLicense driverLicense;
    @Getter
    private boolean checkedSelfie;
    private States state;

    User(Long id, String name, String phoneNumber, DriverLicense driverLicense, boolean checkedSelfie, String statusCode) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.driverLicense = driverLicense;
        this.checkedSelfie = checkedSelfie;

        if ("ACTIVE".equals(statusCode)) {
            this.state = new ActiveState(this);
        } else if ("DORMANCY".equals(statusCode)) {
            this.state = new DormancyState(this);
        } else {
            throw new IllegalArgumentException("Invalid status code");
        }

    }

    public boolean canRentCar() {
        state.needsCheckDrivingLicense();
        state.needsCheckSelfie();
        state.canRentCar();
    }

    private void  checkDrivingLicense() {
        // interface...
        if (!new Interfaces().checkDriveLicense(driverLicense, name)) {
            throw new IllegalStateException("User cannot rent a car");
        }
    }


}
