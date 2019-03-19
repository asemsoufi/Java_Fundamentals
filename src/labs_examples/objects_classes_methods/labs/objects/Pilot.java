package labs_examples.objects_classes_methods.labs.objects;

public class Pilot {

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
