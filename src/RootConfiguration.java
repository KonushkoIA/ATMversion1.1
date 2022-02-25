import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfiguration {

    @Bean
    public ATM atm(){
        return new ATM(50000,true);
    }

    @Bean
    public User user(){
        return new User("Andrey");
    }

    @Bean
    public Card card(){
        return new Card(1, new User("Andrey"), 5000);
    }
}
