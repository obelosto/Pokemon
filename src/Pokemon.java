public abstract class Pokemon {

    private String name;
    private int healthPointLevel;
    private String environment;

    private String weapon;
    //private enum color;

    //Constructor
    //public Pokemon(){};
    //public Pokemon(String name, enum color, int healthPointLevel, String environment){};
    public Pokemon(String name, int healthPointLevel, String environment){};

    //getters
    public String getName() {
        return name;
    }
    public int getHealthPointLevel() { return healthPointLevel; }
    public String getEnvironment() {  return environment; }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHealthPointLevel(int healthPointLevel) {
        this.healthPointLevel = healthPointLevel;
    }

    public void setEnvironment(String environment) { this.environment = environment;   }

    //methods
    public abstract void makesSound();

    public void fightsWith(){
        System.out.println("I can fight.");
    };


}
