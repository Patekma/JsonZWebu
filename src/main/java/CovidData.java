import java.util.ArrayList;
import java.util.List;

public class CovidData {
    private List<DayEntry> data = new ArrayList<>();

    public CovidData() {
        data = new ArrayList<>();
    }

    public List<DayEntry> getData() {
        return data;
    }

    public void setData(List<DayEntry> data) {
        this.data = data;
    }
}
