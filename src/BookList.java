/**
 * @Author:xiang
 * @Date:2020/3/12 14:50
 * 用一个列表来存放书籍
 */
public class BookList {
    private Book[] books=new Book[100];
    private int size=0;
    public BookList() {
        books[0] = new Book("西游记", "吴承恩", "四大名著", false);
        books[1]=new Book("水浒传","施耐庵","四大名著",false);
        books[2]=new Book("红楼梦","曹雪芹","四大名著",false);
        books[3]=new Book("三国演义","罗贯中","四大名著",false);
        size=4;
    }

    public Book getBook(int pos) {
        return books[pos];
    }

    public void setBook(int pos,Book book) {
        books[pos] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
