package baekjoon.july;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Main_1181_�ܾ����� {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>();
		
		for(int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		
		ArrayList<String> list = new ArrayList<>(set);
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) // ���̰� ���� ���
					return o1.compareTo(o2); // ������ ����
				else
					return o1.length() - o2.length();
			}

		});
	 
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
	}
}



/*
 *	�з� : ����
 *	
 *	#����
 * 	Set�� ���� ������ ���� �������� �Ͱ� �����ϰ� ���
 * 	-> Set�� ����ִ� �����͵��� �����ϱ� ���ؼ��� Set -> List ��ȯ�ؾ� ��
 * 	   (List<> list = new ArrayList<>(set);
 *  => ��ȯ �� Collections.sort()�� ����ؼ� ����
 *     1) �������� : Collections.sort(list)
 *     2) �������� : Collections.sort(list, Collections.reverseOrder())
 */
