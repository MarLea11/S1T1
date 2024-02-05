package N1EX1;

// TODO: 1. Create a class called "Instrument" with the attributes name and price.
// TODO: 2. Create an ABSTRACT class method called "PlayInstrument".
// TODO: 3. Create three sub-classes called WindI, StringI and PercussionI that inherit the attributes of Instrument class.
// TODO: 4. Implement the method "PlayInstrument" in the sub-classes that indicates which type of instrument is being played.
// The process of loading a class takes place only once. Show that the load can be caused by the creation of the first instance
// of this class or by accessing a static member of this class using INITIALIZATION BLOCKS and STATIC BLOCKS in JAVA.

public class Main {

    public static void main(String[] args) {

        Instrument.staticMessage();

        WindI instrument1 = new WindI("Flute", 150);
        StringI instrument2 = new StringI("Guitar", 500);
        PercussionI instrument3 = new PercussionI("Drum", 750);

        instrument1.playInstrument("Now is playing a wind instrument");
        System.out.println(instrument1.getName());
        System.out.println(instrument1.getPrice());
        System.out.println();

        instrument2.playInstrument("Now is playing a string instrument");
        System.out.println(instrument2.getName());
        System.out.println(instrument2.getPrice());
        System.out.println();

        System.out.println(instrument3.playInstrument("Now is playing a percussion instrument"));
        System.out.println(instrument3.getName());
        System.out.println(instrument3.getPrice());
        System.out.println();
    }

}
