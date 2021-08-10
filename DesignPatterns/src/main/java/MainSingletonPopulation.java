public class MainSingletonPopulation {
    public static void main(String[] args) {
        SingletonPopulationCounter counter = SingletonPopulationCounter.getInstance();

        counter.increasePopulation("Sofia", 100);
        System.out.println(counter.getPopulation("Sofia"));

        SingletonPopulationCounter instance = SingletonPopulationCounter.getInstance();

        System.out.println(instance.getPopulation("Sofia"));
    }
}
