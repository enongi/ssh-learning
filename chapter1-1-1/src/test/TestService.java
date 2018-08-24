package test;

/**
 * Created by Eagle on 18-8-25
 */
public class TestService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void hello(){
        System.out.println("hello " + getName());
    }
}
