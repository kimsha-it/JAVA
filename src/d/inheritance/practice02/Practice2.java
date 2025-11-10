package d.inheritance.practice02;

class Movie {
    String title;
    double rating;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    void displayInfo() {
        System.out.print(title);
        System.out.print(" (평점: " + rating + ") ");
    }
}

class ActionMovie extends Movie {
    String specialEffect;

    public ActionMovie(String title, double rating, String specialEffect) {
        super(title, rating);
        this.specialEffect = specialEffect;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("- 특수효과: " + specialEffect);
    }
}

class Comedy extends Movie {
    String humorStyle;

    public Comedy(String title, double rating, String humorStyle) {
        super(title, rating);
        this.humorStyle = humorStyle;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("- 유머: " + humorStyle);
    }
}

class Drama extends Movie {
    String theme;

    public Drama(String title, double rating, String theme) {
        super(title, rating);
        this.theme = theme;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("- 주제: " + theme);
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Movie[] movies = {
                new ActionMovie("어벤져스", 4.5, "최고급 CG"),
                new Comedy("극한직업", 4.7, "상황 코미디"),
                new Drama("기생충", 4.9, "계급 갈등")
        };

        for (Movie movie : movies) {
            movie.displayInfo();
        }
    }
}
