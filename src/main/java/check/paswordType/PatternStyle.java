package check.paswordType;

import check.LockSystem;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class PatternStyle implements LockSystem {
    @Value("${phone.name}")
    private String name;

    @Override
    public void lockType() {
        System.out.println("Name -> " + name);
        System.out.println("Using Pattern Matrix");
    }
}
