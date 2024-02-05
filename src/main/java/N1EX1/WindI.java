package N1EX1;

public class WindI extends Instrument {

    // SUB-CLASS BUILDER METHODS
    public WindI(String name, int price) {

        super(name, price);
    }

    // SUB-CLASS METHODS
    @Override
    public String playInstrument(String statusMessage) {
        return statusMessage;
    }

}

