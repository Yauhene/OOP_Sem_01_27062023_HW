// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

public class Duck extends Animal {
    //private String name;
    //private Integer age;
    String creature = "duck";
    Boolean run = true;
    Boolean fly = true;
    Boolean swim = true;
    //private String color;

    public Duck(String name, String color, Integer age, String creature, Boolean run, Boolean fly, Boolean swim) {
    
        super(name, color, age, creature, run, fly, swim);
        //this.name = name;
        //this.age = age;
        this.creature = creature;
        this.run = true;
        //this.color = color;
        this.fly = fly;
        this.swim = swim;
    }

    public Duck(String name, Integer age) {
    
        super(name, age);
        //this.name = name;
        //this.age = age;
        this.creature = "duck";
        this.run = true;
        
        
    }

}
