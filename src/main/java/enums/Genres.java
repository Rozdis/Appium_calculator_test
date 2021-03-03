package enums;

public enum Genres {
    ANIME ("аниме"),
    BIOGRAPHY("биографический"),
    FIGHTERS("боевик");

    private final String value;

    Genres(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
