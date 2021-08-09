import java.util.*;

public class Quiz1 {
    public static void main(String[] args) {

        //숫자 입력 받아서 배열 생성하고 생성한 수만큼 배열에 사용자 입력하기
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 배열의 크기를 입력하세요");
        int firstNum = scanner.nextInt();           //받을 숫자 개수
        int a [] = new int[firstNum];               // 받은 숫자로 빈 배열 생성
        System.out.print("생성한 배열의 크기만큼 숫자를 입력하세요");
        for(int i=0; i<=firstNum -1; i++){
            a[i] = scanner.nextInt();
        }                                           //생성한 빈 배열 수만큼 배열에 숫자 입력 받기
        Arrays.sort(a);                             // 입력 받은 숫자 이진탐색 위해 오름차순으로 정렬하기
        System.out.print("확인할 배열의 크기를 입력하세요 ");
        int secondNum = scanner.nextInt();
        System.out.print("확인할 배열의 크기만큼 숫자를 입력하세요");
        for(int i=0; i<=secondNum-1; i++){
            int result=0, first=0, last=firstNum-1; //결과, 배열의 시작, 배열의 끝 설정
            int targetNum = scanner.nextInt();      //확인할 배열 숫자 입력받기
            while(first<=last){                     //배열의 시작이 배열의 끝보다 커지기 전까지 실행
                int mid = (first+last)/2;           //배열의 중간값은 배열의 시작 + 끝 나누기 2
                if(a[mid]==targetNum){              //만약에 중간값이 내가 찾고자 하는 값과 같다면
                    result = 1;                     //result에 1을 넣고 빠져나와서 출력
                    break;
                }
                if(a[mid]>targetNum){                //중간값이 확인하고자 하는 수보다 크면
                    last = mid-1;                    //중간값에 -1을해서 중간값 포함 배열 마지막에서 중간값보다 큰 수를 제거
                }else{                               //중간값이 확인하고자 하는 수보다 작으면
                    first = mid+1;                   //중간값에 +1을 해서 중간값 포함 배열 처음에서 중간값보다 작은 수 제거
                }

            }System.out.println(result);             //for문이 끝나면 result출력
        }
    }
}

