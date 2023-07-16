package org.example.user.application.state;

import org.example.user.application.User;

public class DormancyState extends States {
    DormancyState(User user) {
        super(user);
    }

    @Override
    public boolean canRentCar() {
        return false;
    }

    @Override
    public boolean needsCheckDrivingLicense() {
        return true;
    }

    @Override
    public boolean needsCheckSelfie() {
        return true;
    }

    @Override
    public States changeState() {
        return new ActiveState(user);
    }
}
