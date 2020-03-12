import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/3/12 15:16
 * 普通用户进行的操作
 */
public class UserOperation {
    //查阅书籍
    public void QueryBooks(BookList bookList){
        System.out.println("请输入你要选择的书籍：");
        Scanner sc=new Scanner(System.in);
        String books=sc.nextLine();
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(books)) {
                System.out.println(book);
            }
        }
    }
    //借阅书籍
    public void BorrowBooks(BookList bookList){
        System.out.println("请输入你要借阅的图书：");
        Scanner sc=new Scanner(System.in);
        String books=sc.nextLine();
        for (int i = 0; i <bookList.getSize() ; i++) {
            Book book=bookList.getBook(i);
            if (book.getName().equals(books)){
                if (book.isState()){
                    continue;
                }else{
                    book.setState(true);
                    System.out.println("借书成功！");
                    return;
                }
            }
        }
        System.out.println("借书失败");
    }
    //归还书籍
    public void ReturnBooks(BookList bookList){
        System.out.println("请输入你要归还的图书：");
        Scanner sc=new Scanner(System.in);
        String books=sc.nextLine();
        for (int i = 0; i <bookList.getSize() ; i++) {
            Book book=bookList.getBook(i);
            if (book.getName().equals(books)){
                if (book.isState()){
                    book.setState(false);
                    System.out.println("归还成功");
                    return;
                }
            }
        }
        System.out.println("还书失败！");
    }
}
