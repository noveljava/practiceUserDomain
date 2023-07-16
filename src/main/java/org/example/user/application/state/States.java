package org.example.user.application.state;

import org.example.user.application.User;

public abstract class States {
    User user;

    States(User user) {
        this.user = user;
    }

    public abstract boolean canRentCar();
    public abstract boolean needsCheckDrivingLicense();
    public abstract boolean needsCheckSelfie();
    public abstract States changeState();
}
