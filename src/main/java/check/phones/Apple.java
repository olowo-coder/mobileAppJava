package check.phones;

import check.NewPhone;
import check.Sim;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Apple implements NewPhone {

    private int id;
    private Sim sim;
    @Autowired
    public Apple(Sim sim) {
        System.out.println("Inside constructor");
        this.sim = sim;
    }

    public void printInternet(){
        System.out.println("Using Apple phone");
        sim.data();
    }

    public void allData(){
        System.out.println("Using Apple phone to call");
        sim.calling();
    }
}
