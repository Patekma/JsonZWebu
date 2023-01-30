import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Nacti {
    public CovidData loadData() throws DataProviderException{

        CovidData data = null;
        try {
            URL url = new URL("https://url.......");
            InputStreamReader inp = new InputStreamReader(url.openStream());
            Gson gson = new Gson();
            return gson.fromJson(inp, CovidData.class);
        } catch (MalformedURLException e) {
            throw new DataProviderException("Chyble url", e);
        } catch (IOException e) {
            throw new DataProviderException("Chyba pri cteni dat", e);
        }
    }
}
