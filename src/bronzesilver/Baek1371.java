package bronzesilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1371 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int arr[] = new int[26];
        while((str = br.readLine()) != null){
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                    arr[str.charAt(i) - 'a']++;
                }
            }
        }

        int max = 0;
        for(int i = 0; i < 26; i++){
            max = Math.max(max, arr[i]);
        }

        for(int i = 0; i < 26; i++){
            if(arr[i] == max){
                System.out.print((char)('a' + i));
            }
        }
    }
}