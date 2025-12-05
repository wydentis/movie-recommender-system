package me.wydentis.movierecommendersystem;

public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[]{"Shark Tale", "Happy Feet", "Ice Age",};
    }
}
