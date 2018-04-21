package softuni.oop_advanced.enums.weekdays;

public class Main {
    public static void main(String[] args) {
        WeeklyCalendar wc = new WeeklyCalendar();
        wc.addEntry("sunday", "sleep");
        wc.addEntry("monday", "work");

        for (WeeklyEntry weeklyEntry : wc.getWeeklySchedule()) {
            System.out.println(weeklyEntry);
        }
    }
}
