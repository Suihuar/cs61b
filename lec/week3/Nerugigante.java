public class Nerugigante implements Animal{
    public String name;
    public int level;
    //Constructor
    public Nerugigante(String name, int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void makeNoise(){
        System.out.println("mie!");
    }
}
