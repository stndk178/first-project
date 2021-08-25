package c3;
import java.util.*;
public class c3_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int coin = Integer.parseInt(input.nextLine());
        int count = 0;
        while(coin>=10){
            if(coin>=500){
                coin -= 500;
                count++;

            }else if(coin>=100){
                coin -= 100;
                count++;

            }else if(coin>=50){
                coin -= 50;
                count++;

            }else{
                coin -= 10;
                count++;

            }

        }
        System.out.println(count);

    }
}
