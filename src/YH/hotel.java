package YH;
import java.util.Scanner;
public class hotel {
    public static void main(String[] args) {
        H h=new H();
        while (true){
            System.out.println("请输入功能编号：1：查看房间状态；2：订房；3：退房；0：退出系统");
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            if(n==1){
                h.print();
            }else if(n==2){
                System.out.println("请输入你要订的房间号：");
                int num=s.nextInt();
                h.order(num);
            }else if(n==3){
                System.out.println("请输入你要退的房间号：");
                int num=s.nextInt();
                h.exit(num);
            }else if(n==0){
                System.out.println("系统退出！");
                return;
            }else{
                System.out.println("输入编号有误，请重新输入！");
            }
        }
    }
}
