import java.util.*;

public class Quiz3 {
    static int K;           //영식이가 가지고 있는 랜선 개수
    static int N;           //필요한 랜선 개수
    static int[] arr;       //가지고 있는 랜선 길이 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();   //영식이가 가지고 있는 랜선 개수 사용자 입력
        N = sc.nextInt();   //필요한 랜선 개수 사용자 입력

        arr = new int[K];   //필요한 랜선 개수만큼 배열 생겅

        for(int i=0; i<K; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        long high = arr[K-1]; //배열이기 때문에 랜건 개수에 -1
        long low = 1;         //
        long mid = 0;         //

        while(low<=high){
            long count = 0;

            mid = (low+high)/2;
            for(int i=0; i<arr.length; i++) count += arr[i]/mid;
            if(count >=N) low = mid+1;
            else if(count<N) high = mid-1;
        }
        System.out.println(high);
    }
}
