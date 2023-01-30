import com.google.gson.annotations.SerializedName;

public class DayEntry {

    //@SerializedName: date -> v Jsonu jako datum...
    @SerializedName("datum")
    private String date;
    @SerializedName("pocet_PCR_testy")
    private int pcrTotal;

    @SerializedName("pozitivni")
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

    @Override
    public String toString() {
        return "DayEntry{" +
                "date='" + date + '\'' +
                ", pcrTotal=" + pcrTotal +
                ", positive=" + positive +
                '}';
    }
}
