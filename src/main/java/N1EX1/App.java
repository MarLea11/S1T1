package N1EX1;

public class App {

    private App() {}

    public static void runProgram() {

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
