package study.basecamp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {


    @Bean
    public Game game(){
        return new GameImpl();
    }

    @Bean
    public NumberGenerator generator(){
        return new NumberGeneratorImpl();
    }


}
