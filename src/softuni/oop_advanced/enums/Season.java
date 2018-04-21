package softuni.oop_advanced.enums;

public enum Season {
    SPRING(28), SUMMER(44), AUTUMN(22), WINTER(4);

    private int maxTemp;

    Season(int maxTemp) {
        this.setMaxTemp(maxTemp);
    }

    public int getMaxTemp() {
        return this.maxTemp;
    }

    private void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    @Override
    public String toString() {
        return super.name().toLowerCase();
    }
}
