package softuni.oop_advanced.dependency_inversion.p02_services;

import softuni.oop_advanced.dependency_inversion.p02_services.interfaces.NotificationService;

public class EmailNotificationService implements NotificationService {

    private boolean isActive;

    public EmailNotificationService(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public void sendNotification() {

    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }
}
