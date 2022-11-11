public class Phone {
    private String model;
    private int age;
    private int weight;
    private boolean hasSimCard = false;

    public Phone(String model,int age, int weight) {
        this.model = model;
        this.age = age;
        this.weight = weight;
    }
    public void setModel (String model){
            this.model = model;
    }
    public String getModel () {
            return model;
    }
    public void setAge ( int Age){
            this.age = age;
    }
    public int getAge () {
            return age;
    }
    public void setWeight ( int Age){
            this.weight = weight;
    }
    public int getWeight () {
            return weight;
    }
}
