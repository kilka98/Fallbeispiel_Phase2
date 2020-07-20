import java.util.ArrayList;
import java.util.List;


public class Oberimmobilie implements  Immobilie{

    private int preis;
    private String name;
    private int raumanzahl;
    private String standort;
    private String art;
    private int size;
    private int j = 0;

    public Oberimmobilie(int preis, String name, int raumanzahl, String standort, String art, int size){
        this.preis = preis;
        this.art = art;
        this.name = name;
        this.raumanzahl = raumanzahl;
        this.standort = standort;
        this.size = size;
    }

    @Override
    public int getPreis(){
        return preis;
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public int getRaumanzahl(){
        return raumanzahl;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getStandort(){
        return standort;
    }

    @Override
    public String getArt(){
        return art;
    }

    private List<Immobilie> childImmobilies = new ArrayList<Immobilie>();
    private List<Immobilie> filterImmobilies = new ArrayList<Immobilie>();

    @Override
    public void add(Immobilie immobilie) {
        childImmobilies.add(immobilie);
    }

    @Override
    public void remove(Immobilie immobilie) {
        childImmobilies.remove(immobilie);
    }

    @Override
    public void print(){
        for (Immobilie immobilie : childImmobilies) {
            immobilie.print();
        }
    }



    public int printSale(){
        for (Immobilie immobilie : childImmobilies) {
            j += immobilie.getPreis() ;

        }
        System.out.println("Preis der Immobilien:" +j);
        return j;
    }

    public  void filter(String filter){
        filterImmobilies.clear();
        for (Immobilie immobilie : childImmobilies) {
            if (immobilie.getStandort().equals(filter)) {
                    filterImmobilies.add(immobilie);
                }
            }

        System.out.println("Liste gefiltert nach Standort: "+filter);
        for (Immobilie immobilie: filterImmobilies) {
            immobilie.print();
        }
    }
}
