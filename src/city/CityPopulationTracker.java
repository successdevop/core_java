package city;

import java.util.HashMap;

public class CityPopulationTracker{
    private final HashMap<String, City> cityPopulation;

    public CityPopulationTracker(){
        this.cityPopulation = new HashMap<>();
    }

    public City getCity(String key){
        return new City(this.cityPopulation.get(key));
    }

    public void setCity(City city){
        this.cityPopulation.put(city.getName(), new City(city));
    }

    public void addCity(City city){
        this.cityPopulation.put(city.getName(), new City(city));
    }
}