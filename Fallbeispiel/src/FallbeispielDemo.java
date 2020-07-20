public class FallbeispielDemo {

    public static void main(String[] args) {
        Immobilie oberimmobilieHaus = new Oberimmobilie(0, "XXX", 0, "xxx", "xxx", 0);
        Immobilie oberimmobilieWohnung = new Oberimmobilie(0, "XXX", 0, "xxx", "xxx", 0);
        Immobilie oberimmobilieBungalow = new Oberimmobilie(0, "XXX", 0, "xxx", "xxx", 0);



        //Teilaufgabe 2.b

        Immobilie imo1 = new Haus(100000, "Einfamilienhaus", 9, "Bochum", 200);
        Immobilie imo2 = new Haus(120000, "Einfamiienhaus mit großen Garten", 8, "Bochum", 230);
        Immobilie imo3 = new Wohnung(16000, "Innenstadtnahe Wohnung", 6, "Bochum", 100);
        Immobilie imo4 = new Wohnung(15000, "Loftwohnung", 5, "Bochum", 100);
        Immobilie imo5 = new Bungalow(20000, "Helles und offenes Bungalow", 7, "Bochum", 160);
        Immobilie imo6 = new Bungalow(18000, "Kleines Bungalow", 5, "Bochum", 100);

        oberimmobilieHaus.add(imo1);
        oberimmobilieHaus.add(imo2);
        oberimmobilieWohnung.add(imo3);
        oberimmobilieWohnung.add(imo4);
        oberimmobilieBungalow.add(imo5);
        oberimmobilieBungalow.add(imo6);

        oberimmobilieHaus.print();
        oberimmobilieBungalow.print();
        oberimmobilieWohnung.print();

        //Entfernen der Immobilien
        System.out.println("---------Ausgabe mit entfernten Immobilien---------");
        oberimmobilieHaus.remove(imo2);
        oberimmobilieBungalow.remove(imo5);
        oberimmobilieWohnung.remove(imo3);

        oberimmobilieHaus.print();
        oberimmobilieBungalow.print();
        oberimmobilieWohnung.print();


        // Hinzufügen von vier zufälligen Immobilien
        System.out.println("---------Ausgabe mit neuen Immobilien---------");
        Immobilie imo7 = new Wohnung(20000, "Sehr große Wohnung", 6, "Stuttgart", 180);
        Immobilie imo8 = new Wohnung(10000, "Kellerwohnung", 5, "Stuttgart", 40);
        Immobilie imo9 = new Bungalow(20000, "Bungalow in guter Nachbarschaft", 7, "Stuttgart", 160);
        Immobilie imo10 = new Bungalow(80000, "Familienbungalow", 12, "Wattenscheid", 300);

        oberimmobilieWohnung.add(imo7);
        oberimmobilieWohnung.add(imo8);
        oberimmobilieBungalow.add(imo9);
        oberimmobilieBungalow.add(imo10);

        oberimmobilieHaus.print();
        int a = oberimmobilieHaus.printSale();
        oberimmobilieBungalow.print();
        int b = oberimmobilieBungalow.printSale();
        oberimmobilieWohnung.print();
        int c = oberimmobilieWohnung.printSale();

        int d = a+b+c;
        System.out.println("Gesamtpreis der Anwendungsimmoblien: "+d +"$");

        //2.c
        //Anwendung der Filterfunktion
        //Es müssen noch 2 Immobilien in der Stadt Wattenscheid erstellt werden um Kriterien der Aufgabe zu erfüllen
        Immobilie imo11 = new Haus(180000, "Altbau", 9, "Wattenscheid", 180);
        Immobilie imo12 = new Haus(280000, "Luxusvilla", 16, "Wattenscheid", 300);

        oberimmobilieHaus.add(imo11);
        oberimmobilieHaus.add(imo12);

        System.out.println("---------Ausgabe der Immobilien gefiltert nach Bochum---------");
        oberimmobilieHaus.filter("Bochum");
        oberimmobilieWohnung.filter("Bochum");
        oberimmobilieBungalow.filter("Bochum");
        System.out.println("---------Ausgabe der Immobilien gefiltert nach Stuttgart---------");
        oberimmobilieHaus.filter("Stuttgart");
        oberimmobilieWohnung.filter("Stuttgart");
        oberimmobilieBungalow.filter("Stuttgart");
        System.out.println("---------Ausgabe der Immobilien gefiltert nach Wattenscheid---------");
        oberimmobilieHaus.filter("Wattenscheid");
        oberimmobilieWohnung.filter("Wattenscheid");
        oberimmobilieBungalow.filter("Wattenscheid");
    }
}