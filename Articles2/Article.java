package Articles2;

public class Article {
    private String title;
    private String content;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    /*public  void edit(String content){
        this.content = content;
    }

    public void changeAuthor(String author){
        this.author = author;
    }

    public void rename(String title){
        this.title = title;
    }*/

    @Override
    public String toString(){
        String result = String.format("%s - %s: %s", this.title, this.content, this.author);
        return result;
    }



}
