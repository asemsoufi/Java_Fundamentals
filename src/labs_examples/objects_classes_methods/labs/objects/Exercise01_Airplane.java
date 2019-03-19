package labs_examples.objects_classes_methods.labs.objects;

public class Exercise01_Airplane {

    public static void main(String[] args) {

        Pilot myPilot = new Pilot("Asem",42,10);
        AirplaneEngine myEngine = new AirplaneEngine(900);
        Airplane myAirplane = new Airplane(myEngine,myPilot);

        System.out.println(myAirplane.toString());
    }

}

