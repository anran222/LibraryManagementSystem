import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/3/12 15:16
 * 管理员进行的操作
 */
public class AdministratorAction {
    //添加书籍
    public void AddBooks(BookList bookList){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要添加的书籍名称");
        String name=sc.nextLine();
        System.out.println("请输入书籍作者");
        String author=sc.nextLine();
        System.out.println("请输入书籍类型");
        String type=sc.nextLine();
       Book book=new Book("name","autor","type",false);
       int size=bookList.getSize();
       bookList.setBook(size,book);
       bookList.setSize(size+1);
        System.out.println("添加图书成功！");
    }
    //删除书籍
    public void DaleteBooks(BookList bookList){
        System.out.println("请输入要删除的图书：");
        Scanner sc=new Scanner(System.in);
        String books=sc.nextLine();
        int i=0;
        for (; i <bookList.getSize() ; i++) {
            Book book=bookList.getBook(i);
                if (book.getName().equals(books)){
                    break;
                }
            }
        if (i>bookList.getSize()){
            System.out.println("没有找到图书！删除失败");
            return;
        }
        int size=bookList.getSize();
        bookList.setBook(i,bookList.getBook(size-1));
        bookList.setSize(size-1);
        }
        //查看所有书籍
    public void ViewAllBooks(BookList bookList){
        for (int i = 0; i <bookList.getSize() ; i++) {
            Book book=bookList.getBook(i);
            System.out.println(book);
        }
    }
}
