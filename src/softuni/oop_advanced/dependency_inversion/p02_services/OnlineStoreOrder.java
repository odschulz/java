package softuni.oop_advanced.dependency_inversion.p02_services;

import softuni.oop_advanced.dependency_inversion.p02_services.interfaces.NotificationService;

public class  OnlineStoreOrder {

    private NotificationService[] notificationServices;

    public OnlineStoreOrder(NotificationService... notificationServices) {
        this.notificationServices = notificationServices;
    }

    public void process() {
        for (NotificationService notificationService : this.notificationServices) {
            if (notificationService.isActive()) {
                notificationService.sendNotification();
            }
        }
    }
}
