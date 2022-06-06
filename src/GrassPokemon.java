public class GrassPokemon extends Pokemon{

 String weapon = "poison";

    private String herbsType;
    private String symptoms;

    //Constructor

    public GrassPokemon(String name, int healthPointLevel, String environment, String herbsType, String symptoms ) {
        super(name, healthPointLevel, environment);
        this.herbsType = herbsType;
        this.symptoms = symptoms;
    }

    //getters
    public String getHerbsType() {
        return herbsType;
    }

    public String getSymptoms() {
        return symptoms;
    }

    //setters
    public void setHerbsType(String herbsType) {
        this.herbsType = herbsType;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public void makesSound(){
        System.out.println("I rustle the grass to give off as many smells as possible.");
    };

    @Override
    public void fightsWith() {
        System.out.println("I secrete " + weapon);
    }
}
