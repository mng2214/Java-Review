import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;


public class State {
     List<String> cities;

    public void addCity(String city) {
       cities.add(city);
    }

}
