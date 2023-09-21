import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[10][10]; // 10*10 배열을 생성.
        int max = 0;    // 최댓값을 초기에 0으로 설정.
        int x = 0, y =0;    // 최댓값의 행렬을 가져올 변수.

        for (int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                arr[i][j] = sc.nextInt();   // 9*9배열을 사용자로부터 입력받음.
                if(max < arr[i][j]){    // max의 값이 arr[i][j]보다 작으면
                    max = arr[i][j];    // max의 값을 arr[i][j]로 치환.
                    x = i;    // 위치의 경우 배열은 0부터 시작하므로 1부터 시작할 수 있도록 +1함
                    y = j;    // 1~9 배열을 만들기 위한 단순 시각 편리화.
                }
            }
        }
        System.out.println(max);    // max의 값 출력.
        System.out.print((x+1)+ " " +(y+1));    // max의 위치(행렬)를 출력.
    }

}
