package softuni.oop_advanced.dependency_inversion.p02_services;

import softuni.oop_advanced.dependency_inversion.p02_services.interfaces.NotificationService;

public class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification() {

    }

    @Override
    public boolean isActive() {
        return false;
    }
}
