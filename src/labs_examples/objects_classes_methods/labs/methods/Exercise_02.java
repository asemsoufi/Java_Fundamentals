package labs_examples.objects_classes_methods.labs.methods;

class Example_Airplane {

    public static void main(String[] args) {

        Pilot myPilot = new Pilot("Asem",42,10);
        AirplaneEngine myEngine = new AirplaneEngine(900);
        Airplane myAirplane = new Airplane(myEngine,myPilot);

        myPilot.setName("Hadeel");
        myPilot.setAge(34);
        myPilot.setYearsOfExperience(5);

        myEngine.setHorsePower(1200);

        myAirplane.setCurrentFuelLevel(50);
        System.out.println("Current fuel level is " + myAirplane.getCurrentFuelLevel() + "%" +
                ", and the pilot is " + myAirplane.getpilot().name + ".");

        System.out.println("\n\n");


        System.out.println(myAirplane.toString());
    }

}

class Airplane {

    private double fuelCapacity = 5000;
    private int currentFuelLevel = 100;
    private int maxSpeed = 900;
    private double weight = 10000;
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
                ", currentFuelLevel=" + currentFuelLevel + "%" +
                "\n, maxSpeed=" + maxSpeed + "km/h" +
                ", weight=" + weight + "kg" +
                "\n, engine=" + engine.toString() +
                ", pilot=" + pilot.toString() +
                '}';
    }
}

class AirplaneEngine {

    private double horsePower;

    public AirplaneEngine(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "AirplaneEngine{" +
                "horsePower=" + horsePower +
                '}';
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

}

class Pilot {

    String name;
    private int Age;
    private int yearsOfExperience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

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