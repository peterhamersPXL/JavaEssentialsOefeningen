package be.pxl.h3;

public enum Dag {
    MAANDAG(false),
    DINSDAG(false),
    WOENSDAG(false),
    DONDERDAG(false),
    VRIJDAG(false),
    ZATERDAG(true),
    ZONDAG(true);

    private final boolean isWeekend;

    private Dag(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public String getTypeDag() {
        if (this.isWeekend) {
            return "Weekenddag";
        } else {
            return "Weekdag";
        }
    }
}