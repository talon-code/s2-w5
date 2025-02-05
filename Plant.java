public class Plant{
    private int age;
    private String name;
    private double height;

    public Plant (String name){
          age = 0;
          this.name = name;
          height = 0;
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
}
