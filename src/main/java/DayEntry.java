public class DayEntry {

    private String date;
    private int pcrTotal;
    private int positive;

    public DayEntry(String date, int pcrTotal, int positive) {
        this.date = date;
        this.pcrTotal = pcrTotal;
        this.positive = positive;
    }

    public DayEntry() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPcrTotal() {
        return pcrTotal;
    }

    public void setPcrTotal(int pcrTotal) {
        this.pcrTotal = pcrTotal;
    }

    public int getPositive() {
        return positive;
    }

    public void setPositive(int positive) {
        this.positive = positive;
    }
}
