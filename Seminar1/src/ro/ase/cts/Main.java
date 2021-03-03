package ro.ase.cts;
import clase.Animal;
import clase.Lion;
import clase.WildCat;
import clase.Zoo;
public class Main {
public static void main(String[] args) {
    Zoo zoo = new Zoo();
    Lion lion1 = new Lion("leu");
    Lion lion2 = new Lion("altLeu");
    Animal lion3 = new Lion("RegeleLeu");
    zoo.addAnimal(lion1);
    zoo.addAnimal(lion2);
    zoo.feedAllAnimals();

    WildCat aSmallCat = new WildCat("kitty");
    WildCat aFurballCat = new WildCat("softkitty");
    //MET PROC N-AU OPERATII LA CONSOLA
    zoo.addAnimal(aSmallCat);
    zoo.addAnimal(aFurballCat);
    zoo.feedAllAnimals();
    //Interfata are doar fct virtuale, in Java are doar metode abstracte
}
}
