import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/3/12 14:27
 * 普通用户界面
 */
public class UserMenu implements Menu {
    @Override
    public void InitMenu() {
        while (true) {
            System.out.println("请选择你要进行的操作");
            System.out.println("1、查询书籍");
            System.out.println("2、借阅书籍");
            System.out.println("3、归还书籍");
            UserOperation user = new UserOperation();
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            BookList books = new BookList();
            switch (choice) {
                case 1:
                    user.QueryBooks(books);
                    break;
                case 2:
                    user.BorrowBooks(books);
                    break;
                case 3:
                    user.ReturnBooks(books);
                    break;
                default:
                    break;
            }
        }
    }
}
