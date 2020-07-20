public interface Immobilie {
    public int getPreis();
    public String getStandort();
    public int getSize();
    public int getRaumanzahl();
    public String getName();
    public String getArt();
    public void add(Immobilie immobilie);
    public void remove(Immobilie immobilie);
    public void print();
    public int printSale();
    public void filter(String filter);

}
