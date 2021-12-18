package check.paswordType;

import check.LockSystem;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("faceScanner")
public class FaceScan implements LockSystem {
    @Value("${phone.name}")
    private String name;

    public void lockType(){
        System.out.println("Name -> " + name);
        System.out.println("Using Face recognition");
    }
}
