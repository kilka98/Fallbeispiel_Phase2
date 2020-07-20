public class Wohnung implements Immobilie{


    private int preis;
    private String name;
    private int raumanzahl;
    private String standort;
    private String art;
    private int size;


    public Wohnung(int preis, String name, int raumanzahl, String standort, int size){
        this.preis = preis;
        this.art = "Wohnung";
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

    @Override
    public void add(Immobilie immobilie){

    }

    @Override
    public void remove(Immobilie immobilie){

    }

    @Override
    public int printSale(){
        return 0;
    }

    @Override
    public void print(){
        System.out.println("==========================");
        System.out.println("Name ="+getName());
        System.out.println("Art ="+getArt());
        System.out.println("Preis ="+getPreis());
        System.out.println("Size ="+getSize());
        System.out.println("Standort ="+getStandort());
        System.out.println("Raumanzahl ="+getRaumanzahl());
        System.out.println("==========================");
    }

    public void filter(String filter){

    }

}
