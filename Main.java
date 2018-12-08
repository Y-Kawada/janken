import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String you = sc.nextLine();
        String[] me = {"グー","チョキ","パー"};
        int num = (int)(Math.random() * 3);
        System.out.println(me[num]);
        if(you.equals(me[num])){
            System.out.println("あいこ！");
        }else if(you.equals("グー") && num == 1){
            System.out.println("あなたの勝ち！");
        }else if(you.equals("グー") && num == 2){
            System.out.println("私の勝ち！");
        }else if(you.equals("チョキ") && num == 0){
            System.out.println("私の勝ち！");
        }else if(you.equals("チョキ") && num == 2){
            System.out.println("あなたの勝ち！");
        }else if(you.equals("パー") && num == 0){
            System.out.println("あなたの勝ち！");
        }else if(you.equals("パー") && num == 2){
            System.out.println("私の勝ち！");
        }
    }
}
