import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        ArrayList<String> animals = zoo.afiseazaAnimale();
        System.out.println(animals);
//        Elefant elefant=new Elefant("Eli", 5);
  //     System.out.println("Elefantul" +elefant);
//        Animal lup = new Animal("Lupoiul", 3);
//        System.out.println(Animal);
        Zoo zoo1 = new Zoo();
        ArrayList<String> animale2 = zoo.afiseazaAnimale2();
        System.out.println(animale2);
        animale2.add("Cal");
        System.out.println(animale2);


//
//
//        List<String> animale = new ArrayList<>();
//        animale.add("Elefant");
//        animale.add("Leu");
//        animale.add("Lup");
//        animale.add("Jaguar");
//        animale.add("Zebra");
        //addanimal

//        List<String> animale2 = new ArrayList<>();
//        animale2.add("Capra");
//        animale2.add("Cal");
//
//        animale.addAll(animale2);
//        System.out.println(animale);
//
//        animale.remove("Capra");
//        animale.remove(2);
//        System.out.println(animale);
//        System.out.println(animale.contains("Lup"));
//        System.out.println(animale.contains("Iepure"));
//        System.out.println(animale.equals(animale2));
//        System.out.println(animale.size());
//        System.out.println(animale.get(4));
//        animale.set(0, "Lup");
//        System.out.println(animale);

    }
}