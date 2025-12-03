package me.wydentis.movierecommendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        ContentBasedFilter cbf1 = context.getBean(ContentBasedFilter.class);
        ContentBasedFilter cbf2 = context.getBean(ContentBasedFilter.class);
        ContentBasedFilter cbf3 = context.getBean(ContentBasedFilter.class);

        System.out.println(cbf1);
        System.out.println(cbf2);
        System.out.println(cbf3);
    }

}
