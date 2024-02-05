package N1EX1;

public class PercussionI extends Instrument {


    // SUB-CLASS BUILDER METHODS
    PercussionI(String name, int price) {
        super(name, price);
    }

    // SUB-CLASS METHODS
    @Override
    public String playInstrument(String statusMessage) {
        return statusMessage;
    }

}