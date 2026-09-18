package s1.builder;

public class Movie {
    private final String name;
    private final int count;
    private final String genre;

    private Movie(Builder builder){
        this.name = builder.name;
        this.count = builder.count;
        this.genre = builder.genre;
    }

        public static class Builder {
        private final String name;
        private int count;
        private String genre;

        public Builder(String name){
            this.name = name;
        }

        public Builder count(int count){
            this.count = count;
            return this;
        }

        public Builder genre(String genre){
            this.genre = genre;
            return this;
        }

        public Movie build(){
            return new Movie(this);
        }

    }

    public static void main(String[] args) {
        Movie movie = new Builder("Amin")
                .count(100).genre("Action").build();

        System.out.println(movie.name);
        System.out.println(movie.count);
        System.out.println(movie.genre);
    }

}
