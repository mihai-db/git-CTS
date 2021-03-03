package ro.ase.eu.seminar1.clase;

public class Zookeeper {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    public void feed(Animal animalZoo)

    {
        System.out.println("Ingrijitorul " + this.name + " hraneste animalul " + animalZoo.getNume());
    }
}
