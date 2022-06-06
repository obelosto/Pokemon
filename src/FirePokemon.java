public class FirePokemon extends Pokemon {

    String weapon = "flame";

    private String helmetСolor;
    private String suitSize;

    //Constructor
    //public FirePokemon(){};

    public FirePokemon(String name, int healthPointLevel, String environment, String helmetСolor, String suitSize ) {
        super(name, healthPointLevel, environment);
        this.helmetСolor = helmetСolor;
        this.suitSize = suitSize;
    }

    //getters
    public String getHelmetСolor() {
        return helmetСolor;
    }

    public String getSuitSize() {
        return suitSize;
    }

    //setters
    public void setHelmetСolor(String helmetСolor) {
        this.helmetСolor = helmetСolor;
    }

    public void setSuitSize(String suitSize) {
        this.suitSize = suitSize;
    }

    public void makesSound(){
        System.out.println("After the explosion, I make fizzling sound.");
    };

    @Override
    public void fightsWith() {
        System.out.println("I fight with " + weapon);
    }


}






