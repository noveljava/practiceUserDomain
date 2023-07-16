package org.example.user.application.state;
import org.example.user.application.User;

public class ActiveState extends States {
    ActiveState(User user) {
        super(user);
    }

    @Override
    public boolean canRentCar() {
        return needsCheckDrivingLicense() && needsCheckSelfie();
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
        return new DormancyState(user);
    }
}
