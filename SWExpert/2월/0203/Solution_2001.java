import java.util.Scanner;

public class Solution_2001_파리퇴치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int sum = 0;
			int max = 0;
			
			int[][] arr = new int[N][N];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++)
					arr[i][j] = sc.nextInt();
			}
			
			for(int i = 0; i <= N-M; i++) {
				for(int j = 0; j <= N-M; j++) {
					for(int y = 0; y < M; y++) {
						for(int x = 0; x < M; x++)
							sum += arr[i+y][j+x];
					}
					if(max < sum)
						max = sum;
					sum = 0;
				}
			}
			
			System.out.println("#" + tc + " " + max);
		}
	}
}
