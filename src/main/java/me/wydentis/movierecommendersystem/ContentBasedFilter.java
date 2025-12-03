package me.wydentis.movierecommendersystem;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
