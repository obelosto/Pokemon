public class WaterPokemon extends Pokemon{

    String weapon = "moisture";

    private int boatsNumber;
    private Boolean monkeyWrench;

    //Constructor
    //public WaterPokemon(String name){};

    public WaterPokemon(String name, int healthPointLevel, String environment, int boatsNumber, Boolean monkeyWrench ) {
        super(name, healthPointLevel, environment);
        this.boatsNumber = boatsNumber;
        this.monkeyWrench = monkeyWrench;
    }

    //getters
    public int getBoatsNumber() {
        return boatsNumber;
    }

    public Boolean getMonkeyWrench() {
        return monkeyWrench;
    }

    //setters
    public void setBoatsNumber(int boatsNumber) {
        this.boatsNumber = boatsNumber;
    }

    public void setMonkeyWrench(Boolean monkeyWrench) {
        this.monkeyWrench = monkeyWrench;
    }

    public void makesSound(){
        System.out.println("I make gurgling and whistling sounds, while flooding all the surroundings.");
    };

    @Override
    public void fightsWith() {
        System.out.println("I'm flowing with " + weapon);
    }

}
