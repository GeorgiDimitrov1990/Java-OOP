import java.util.HashMap;
import java.util.Map;

public class SingletonPopulationCounter implements  SingletonContainer{
    private Map<String, Integer> populationMap;
    private static  SingletonPopulationCounter instance;

    private SingletonPopulationCounter(){
        this.populationMap = new HashMap<String, Integer>();
    }
    public static SingletonPopulationCounter getInstance(){
        //lazy loading
        if (instance != null){
            return instance;
        }
        return instance = new SingletonPopulationCounter();
    }

    public void increasePopulation(String city, int increment){
        this.populationMap.putIfAbsent(city, 0);
        this.populationMap.put(city, this.populationMap.get(city) + increment);
    }

    public void decreasePopulation(String city, int decrement){
        this.populationMap.put(city, this.populationMap.get(city) - decrement);
    }





    public int getPopulation( String city) {
        return this.populationMap.get(city);
    }
}
