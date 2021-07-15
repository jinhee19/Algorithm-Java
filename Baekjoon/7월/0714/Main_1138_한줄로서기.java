package baekjoon.july;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1138_���ٷμ��� {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine()); // �ο� ��
		int[] info = new int[N+1];
		int[] answer = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		// Ű�� 1�� ������� ���ʿ� �ڽź��� ū ����� �� �ִ� �� �Է�
		for(int i = 0; i < N; i++) {
			info[i+1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				if(answer[j] == 0 && info[i] == 0) {// �ش� �ڸ��� ����ְ� �ڽź��� ���ʿ� ���־�� �� ��� ����ŭ ��ġ�Ǿ��ִٸ�
					answer[j] = i;
					break;
				}else if(answer[j] == 0) // ���� �ڽź��� ���ʿ� �� �־�� �� ����ŭ �� �������Ƿ� �� �ڸ��� �ִٸ� �ڽź��� ū ����� ������ ����
					info[i]--;
			}
		}
		
		for(int i = 1; i <= N; i++)
			System.out.print(answer[i] + " ");
		
	}
}

/*
 * �з� : ����, �׸���
 * 
 * key point : �Է��� Ű ������� �־����Ƿ� ���߿� ��ġ�Ǵ� ����� ��� ���� ��ġ�Ǵ� ������� ������ Ű�� Ŭ ���̶�� ������ �ִ�.
 * => �׸���(�� ���� ������ �� �� �ִ�)
 */


