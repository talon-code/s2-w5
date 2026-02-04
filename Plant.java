public class Plant{
    private int age;
    private String name;
    private double height;
    // private final String SPECIES;
    private static int numPlants = 0;

    public Plant (String name){
          age = 0;
          this.name = name;
          height = 0;
          numPlants++;
    }

    public String type(){
         return "I am a plant and my name is: " + this.name;
    }

    public void increaseAge(int years){
         age +=years;
    }

    public String name(){
        return name;
    }
    public int age(){
        return age;
    }

    public void increaseNumPlants(){
        numPlants++;
    }

    public static int getNumPlants(){
        return numPlants;
    }
}