import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/3/12 14:30
 * 管理员界面
 */
public class AdminMenu implements Menu {
    @Override
    public void InitMenu() {
        System.out.println("请选择你要进行的操作");
        System.out.println("1、添加书籍");
        System.out.println("2、删除书籍");
        System.out.println("3、查看所有书籍");
        AdministratorAction administratorAction=new AdministratorAction();
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        BookList books=new BookList();
        switch (choice){
            case 1:
                administratorAction.AddBooks(books);
                break;
            case 2:
                administratorAction.DaleteBooks(books);
                break;
            case 3:
                administratorAction.ViewAllBooks(books);
                break;
            default:
                break;
        }
    }
}
