package game;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println("=====猜数字游戏开始=====");
        Random r = new Random();
        int num = r.nextInt(100)+1;
        int count = 7;
        Scanner sc = new Scanner(System.in);
        while(count>=1){
            System.out.println("请输入你猜的数：");
            int answer = sc.nextInt();
            if(answer==num){
                System.out.println("恭喜你，猜对了！");
                break;
            };
            if(answer!=num){
                if(answer<num){
                    System.out.println("你猜小了!");
                    count--;
                };
                if(answer>num){
                    System.out.println("你猜大了!");
                    count--;
                };
            System.out.println("加油，你还剩"+count+"次");

            }
            if(count==0){
                System.out.println("你失败了");
            };
        }









    }
}
