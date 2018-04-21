package softuni.oop_advanced.enums.weekdays;

public class WeeklyEntry implements Comparable<WeeklyEntry> {
    public Weekday getWeekday() {
        return this.weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = Weekday.valueOf(weekday.toUpperCase());;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    private Weekday weekday;
    private String note;

    public WeeklyEntry(String weekday, String note) {
        this.weekday = Weekday.valueOf(weekday.toUpperCase());
        this.note = note;
    }

    @Override
    public String toString() {
        return this.weekday + " - " + this.note;
    }

    @Override
    public int compareTo(WeeklyEntry o) {
        return this.weekday.compareTo(o.weekday);
    }
}
