package org.example.user.application.state;
import org.example.interfaces.application.command.Interfaces;
import org.example.user.application.User;

public class ActiveState extends States {
    public ActiveState(User user) {
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
        if (!user.isCheckedSelfie()) {
            return true;
        }

        return new Interfaces().checkSelfie(user.getName());
    }

    @Override
    public States changeState() {
        return new DormancyState(user);
    }
}
