package softuni.oop_advanced.enums.weekdays;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public String toString() {
        return super.name().charAt(0) + super.name().substring(1).toLowerCase();
    }
}
