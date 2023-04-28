package ca.jovanifrancis.myquotesapplication;

public class QuotesList {

    private final String quoteTxt;
    private final String writer;

    public QuotesList(String quoteTxt, String writer) {
        this.quoteTxt = quoteTxt;
        this.writer = writer;
    }

    public String getWriter() {
        return writer;
    }

    public int getQuote() {
        return 0;
    }
}
