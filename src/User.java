import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/3/12 14:10
 * 判断是普通用户还是管理员
 */
public class User {
    private int user;

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public void customer(){
        Scanner sc=new Scanner(System.in);
        this.user=sc.nextInt();
    }
}
