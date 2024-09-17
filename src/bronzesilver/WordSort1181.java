package bronzesilver;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class WordSort1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n=0;
        String nStr="";

        nStr=br.readLine();
        n=Integer.parseInt(nStr);

        String arr[] = new String[n];

        for(int i=0; i<n; i++){
            arr[i]=br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String str1, String str2){
                if(str1.length()==str2.length()){
                    return str1.compareTo(str2);
                } else {
                    return str1.length() - str2.length();
                }
            }
        });

        String arr2[] = new String[n];
        int arr2Size=0;
        boolean hasStr = false;
        for(int i=0; i<n; i++, hasStr=false){
            for(int j=i+1; j<n; j++){
                if(arr[i].equals(arr[j])){
                    hasStr = true;
                    break;
                }
            }
            if(!hasStr){
                arr2[arr2Size++]=arr[i];
            }
        }

        for(int i=0; i<arr2Size; i++){
            bw.write(arr2[i]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
