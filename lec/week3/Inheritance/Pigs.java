public class Pigs implements Animal{
    public String name;
    public int level;
    // Constructor
    public Pigs(String name, int level){
        this.name = name;
        this.level = level;
    }
    // A small pig can make small noise, and larger pigs can make larger noise.
    @Override
    public void makeNoise(){
        if (level < 10){
            System.out.println("oink! oink!");
        }
        else System.out.println("Auuwwwwwwww!!");
    }
}
