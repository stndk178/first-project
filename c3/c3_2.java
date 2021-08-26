package c3;
import java.util.*;
import java.io.*;

public class c3_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int count = 0;
        int max = arr[arr.length-1];
        int second_max = arr[arr.length-2];

        while(m!=0){
            for(int i=0; i<k; i++){
                if(m==0) break;
                count += max;
                m--;
            }
            count += second_max;
            m--;

        }
        System.out.println(count);

    }
}
