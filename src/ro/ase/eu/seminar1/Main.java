package ro.ase.eu.seminar1;
import clase.Animal;
import clase.Lion;
import clase.WildCat;
import clase.Zoo;
public class Main {
public static void main(String[] args) {
    Zoo zoo = new Zoo();
    Lion lion1 = new Lion("leu");
    Lion lion2 = new Lion("altLeu");
    Animal lion3 = new Lion("Leo");
    zoo.addAnimal(lion1);
    zoo.addAnimal(lion2);
    zoo.feedAllAnimals();

    WildCat cat = new WildCat("kitty");
    WildCat cat1 = new WildCat("softkitty");
    //MET PROC N-AU OPERATII LA CONSOLA
    zoo.addAnimal(cat);
    zoo.addAnimal(cat1);
    zoo.feedAllAnimals();
}
}
