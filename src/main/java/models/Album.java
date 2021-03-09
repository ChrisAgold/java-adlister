package models;

public class Album {
    private int id;
    private String name;
    private String artist;
    private int release_date;
    private Float sales;
    private String genre;

    public Album(){};

    public Album(int id, String name, String artist, int release_date, Float sales, String genre) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.release_date = release_date;
        this.sales = sales;
        this.genre = genre;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public Float getSales() {
        return sales;
    }

    public void setSales(Float sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
