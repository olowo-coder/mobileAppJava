package check;

import check.mobileSim.Airtel;
import check.mobileSim.Vodafone;
import check.paswordType.PatternStyle;
import check.phones.Apple;
import check.phones.Samsung;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("check")
@PropertySource("phone-info.properties")
public class ConfigFiles {
    @Bean
    public Sim sim(){
        return new Airtel();
    }

    @Bean
    public NewPhone phone(){
        return new Samsung(sim());
    }


    @Bean
    public Airtel airtelSim(){
        return new Airtel();
    }

    @Bean
    public Vodafone vodafoneSim(){
        return new Vodafone();
    }

    @Bean
    public Samsung samsungPhone(){
        return new Samsung(sim());
    }

    @Bean
    public Apple applePhone(){
        return new Apple(sim());
    }

    @Bean
    public PatternStyle patternCheck(){
        return new PatternStyle();
    }

}
