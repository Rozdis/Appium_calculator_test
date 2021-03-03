package entities;

import java.util.Objects;

public class Film {
    private String title;
    private String genre;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String author) {
        this.genre = author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Film(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
    public Film(){};


    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(title, film.title) &&
                Objects.equals(genre, film.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre);
    }
}
