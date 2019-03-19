package labs_examples.objects_classes_methods.labs.objects;

class Objects_Airplane {

    public static void main(String[] args) {

        Pilot myPilot = new Pilot("Asem",42,10);
        AirplaneEngine myEngine = new AirplaneEngine(900);
        Airplane myAirplane = new Airplane(myEngine,myPilot);

        System.out.println(myAirplane.toString());
    }

}

class Airplane {

    double fuelCapacity = 5000;
    int currentFuelLevel = 100;
    int maxSpeed = 900;
    double weight = 10000;
    AirplaneEngine engine;
    Pilot pilot;

    public Airplane(AirplaneEngine engine, Pilot pilot) {
        this.engine = engine;
        this.pilot = pilot;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(int currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public AirplaneEngine getengine() {
        return engine;
    }

    public void setengine(AirplaneEngine engine) {
        this.engine = engine;
    }

    public Pilot getpilot() {
        return pilot;
    }

    public void setpilot(Pilot pilot) {
        this.pilot = pilot;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                "\n, maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                "\n, engine=" + engine.toString() +
                ", pilot=" + pilot.toString() +
                '}';
    }
}

class AirplaneEngine {

    double horsePower;

    public AirplaneEngine(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "AirplaneEngine{" +
                "horsePower=" + horsePower +
                '}';
    }
}

class Pilot {

    String name;
    int Age;
    int yearsOfExperience;

    public Pilot(String name, int age, int yearsOfExperience) {
        this.name = name;
        Age = age;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}



