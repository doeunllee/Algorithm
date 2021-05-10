package algorithm;

import java.util.Scanner;

class no1012 {

	static int T, M, N, K, x, y, count;
	static int a[][];
	static boolean visit[][];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		T = scanner.nextInt();

		for (int t = 0; t < T; t++) {
			M = scanner.nextInt();
			N = scanner.nextInt();
			K = scanner.nextInt();

			a = new int[N][M];

			for (int i = 0; i < K; i++) {
				x = scanner.nextInt();
				y = scanner.nextInt();

				a[y][x] = 1;
			}

			visit = new boolean[N][M];
			count = 0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (a[i][j] == 1 && visit[i][j] == false) {
						dfs(i, j);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

	public static void dfs(int n, int m) {

		int dx[] = { 0, 0, -1, 1 };
		int dy[] = { -1, 1, 0, 0 };

		if (visit[n][m] == true)
			return;
		else
			visit[n][m] = true;

		for (int i = 0; i < 4; i++) {
			int nx = n + dx[i];
			int ny = m + dy[i];

			if (0 <= nx && nx < N && 0 <= ny && ny < M) {
				if (a[nx][ny] == 1 && visit[nx][ny] == false) {
					dfs(nx, ny);
				}
			}
		}
	}
}