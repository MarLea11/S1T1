package N1EX1;

public abstract class Instrument {

    // CLASS ATTRIBUTES
    protected String name;
    protected int price;

    // STATIC BLOCK
    static
    {
        System.out.println("Loading class instrument");
    }

    // CLASS BUILDER METHODS
    public Instrument(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // CLASS METHODS
    public static void staticMessage() {
        System.out.println("This is a static message");
    }

    public abstract String playInstrument(String statusMessage);

    // CLASS GETTERS
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}