package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Zookeeper zookeeper;
    private List<Animal> lista;

    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
    }

    public List<Animal> getLista() {
        return lista;
    }

    public void setLista(List<Animal> lista) {
        this.lista = lista;
    }

    public Zoo(Zookeeper zookeeper, List<Animal> lista) {
        this.zookeeper = zookeeper;
        this.lista = lista;
    }

    public Zoo() {
        super();
        this.zookeeper = new Zookeeper("Gigi");
        lista=new ArrayList<>();
    }
    public void addAnimal(Animal a) {
        lista.add(a);
    }
    public void feedAllAnimals()
    {
        for (Animal a:lista) {
            zookeeper.feed(a);
        }
    }
}
