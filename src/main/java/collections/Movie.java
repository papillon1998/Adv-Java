package collections;

public class Movie {

    private Integer serialCode;
    private String title;

    public Movie(Integer serialCode, String title) {
        this.serialCode = serialCode;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSerialCode() {
        return serialCode;
    }
    public void setSerialCode(Integer serialCode) {
        this.serialCode = serialCode;
    }

}
