package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneEngine {

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
