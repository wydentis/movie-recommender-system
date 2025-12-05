package me.wydentis.movierecommendersystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

        System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

        RecommenderImplementation recommender = appContext.getBean("recommenderImplementation", RecommenderImplementation.class);

        String[] result = recommender.recommendMovies("Finding Dory");

        System.out.println(Arrays.toString(result));
        appContext.close();
    }

}
