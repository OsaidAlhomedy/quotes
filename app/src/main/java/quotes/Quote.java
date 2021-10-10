package quotes;

import java.util.Arrays;

public class Quote {

    private String[] tags;
    private String author;
    private String likes;
    private String text;

    public Quote(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public Quote(String[] tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.getText() + " ~ " + this.getAuthor();
    }
}
