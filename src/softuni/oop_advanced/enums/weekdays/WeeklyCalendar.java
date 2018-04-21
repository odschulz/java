package softuni.oop_advanced.enums.weekdays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WeeklyCalendar {
    private List<WeeklyEntry> entries;

    public WeeklyCalendar() {
        this.entries = new ArrayList<>();
    }

    void addEntry(String weekday, String notes) {
        this.entries.add(new WeeklyEntry(weekday, notes));
    }

    Iterable<WeeklyEntry> getWeeklySchedule() {
        this.entries.sort(Comparator.naturalOrder());
        return this.entries;
    }

}
