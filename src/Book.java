/**
 * @Author:xiang
 * @Date:2020/3/12 14:46
 * 建立书的属性和方法
 */
public class Book {
    private String name;
    private String author;
    private String type;
    private boolean state;

    public Book(String name, String author, String type, boolean state) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", type=" + type +
                ", state='" + state + '\'' +
                '}';
    }
}
