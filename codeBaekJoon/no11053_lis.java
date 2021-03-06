package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no11053_lis {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String t = br.readLine();
		StringTokenizer st = new StringTokenizer(t," ");
		int arr[] = new int [n];
		int cache[] = new int[n];
		Arrays.fill(cache, 1);
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int length = 1;
		for(int i=0; i<n; i++){
			for(int j=0; j<i; j++){
				if(arr[i]>arr[j]){
					if(cache[i]<cache[j]+1){
						cache[i]=cache[j]+1;
					}
				}
			}
			length = Math.max(length, cache[i]);
		}
		System.out.println(length);
		
	}
}
