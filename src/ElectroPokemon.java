public class ElectroPokemon extends Pokemon{

  String weapon = "thunderbolt";

    private String conductivity;
    private int admissionLevel;

    //Constructor

    public ElectroPokemon(String name, int healthPointLevel, String environment, String conductivity, int admissionLevel ) {
        super(name, healthPointLevel, environment);
        this.conductivity = conductivity;
        this.admissionLevel = admissionLevel;
    }

    //getters
    public String getСonductivity() {
        return conductivity;
    }

    public int getAdmissionLevel() {
        return admissionLevel;
    }

    //setters
    public void setСonductivity(String conductivity) {
        this.conductivity = conductivity;
    }

    public void setAdmissionLevel(int admissionLevel) {
        this.admissionLevel = admissionLevel;
    }

    public void makesSound(){
        System.out.println("Before I make a short circuit, I crackle");
    };

    @Override
    public void fightsWith() {
        System.out.println("I'm flowing with " + weapon);
    }

}
