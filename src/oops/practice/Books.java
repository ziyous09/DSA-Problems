package oops.practice;

public class Books {
    // All the fields
    private String title;
    private String author;
    private String userRating;
    private String reviews;
    private String price;
    private String year;
    private String genre;

    Books(String title, String author, String userRating, String reviews, String price, String year, String genre){
        this.title = title;
        this.author = author;
        this.userRating = userRating;
        this.reviews = reviews;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }

    //All the getters
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getUserRating(){
        return this.userRating;
    }
    public String getReviews(){
        return this.reviews;
    }
    public String getPrice(){
        return this.price;
    }
    public String getYear(){
        return this.year;
    }
    public String getGenre(){
        return this.genre;
    }
    //All the setter
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setUserRating(String userRating){
        this.userRating = userRating;
    }
    public void setReviews(String reviews){
        this.reviews = reviews;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public void setYear(String year){
        this.year = year;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

}
