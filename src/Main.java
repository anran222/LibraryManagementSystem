import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/3/12 14:09
 * 主程序
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("********欢迎使用图书馆管理系统*********");
        System.out.println("************请选择用户类型*************");
        System.out.println("******1、普通用户     2、管理员********");
        System.out.println("****************************************");
        User user=new User();
        user.customer();
        if (user.getUser()==1){
            new UserMenu().InitMenu();
        }if (user.getUser()==2){
            new AdminMenu().InitMenu();
        }
    }
}
