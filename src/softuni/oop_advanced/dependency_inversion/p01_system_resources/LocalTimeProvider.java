package softuni.oop_advanced.dependency_inversion.p01_system_resources;

import softuni.oop_advanced.dependency_inversion.p01_system_resources.interfaces.TimeProvider;

import java.time.LocalTime;

public class LocalTimeProvider implements TimeProvider {
    private LocalTime localTime;

    public LocalTimeProvider(LocalTime localTime) {
        this.localTime = localTime;
    }

    @Override
    public int getHour() {
        return this.localTime.getHour();
    }
}
