package practicefinal;

import java.util.Scanner;

public class GameDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int[][] score = new int[10][10];
		int[] sum = new int[10];
		int course;
		int percent;
		int truecourse;
		int[][] mechascore = new int[10][10];
		int [] mechasum = new int[10];
		int mechatotal=0;
		System.out.println("何ゲーム行いますか？");
		int game=scanner.nextInt();
		for (int i = 0; i < game; i++) {
			consoleStop();
			System.out.println((i + 1) + "ゲーム目");
			System.out.println("1投目を投げます。投げる方向を選んでください。");
			System.out.println("1:左　2:右　3真ん中");
			 consoleStop();
			course = scanner.nextInt();
			percent = new java.util.Random().nextInt(11);
			if (course == 1 || course == 2) {
				score[i][0] = (int) (percent * 0.9);
				truecourse = 3;
			} else {
				score[i][0] = (int) (percent * 1.3);
				truecourse = new java.util.Random().nextInt(2) + 1;
			}
			if (score[i][0] >= 10) {
				System.out.println("-----------------------------");
				System.out.println("💮おめでとう！！ストライク💮");
				System.out.println("-----------------------------");
				consoleStop();
				score[i][0] = 10;
				sum[i] = 10;
			} else {
				System.out.println(score[i][0] + "本倒しました");
				consoleStop();
				System.out.println("2投目を投げます。投げる方向を選んでください。");
				System.out.println("1:左　2:右　3真ん中");
				consoleStop();
				course = scanner.nextInt();
				percent = new java.util.Random().nextInt(11 - score[i][0]);
				if (course == truecourse) {
					score[i][1] = (int) (percent * 1.3);
				} else {
					score[i][1] = (int) (percent * 0.9);
				}
				if (score[i][0] + score[i][1] >= 10) {
					System.out.println("-----------------------------");
					System.out.println("★スペア！★");
					System.out.println("-----------------------------");
					consoleStop();
					score[i][1] = 10 - score[i][0];
					sum[i] = 10;
				} else {
					System.out.println(score[i][1] + "本倒しました");
					consoleStop();
					sum[i] = score[i][0] + score[i][1];
					System.out.println("合計" + sum[i] + "本倒しました");
					consoleStop();
				}
			}

			if (i == game-1) {
				if (score[i][0] == 10) {
					System.out.println("2投目を投げます。投げる方向を選んでください。");
					System.out.println("1:左　2:右　3真ん中");
					consoleStop();
					course = scanner.nextInt();
					percent = new java.util.Random().nextInt(11);
					if (course == 1 || course == 2) {
						score[i][1] = (int) (percent * 0.9);
						truecourse = 3;
					} else {
						score[i][1] = (int) (percent * 1.3);
						truecourse = new java.util.Random().nextInt(2) + 1;
					}
					if (score[i][1] >= 10) {
						System.out.println("-----------------------------");
						System.out.println("💮おめでとう！ストライク！💮");
						System.out.println("-----------------------------");
						consoleStop();
						score[i][1] = 10;
						sum[i] = 20;
						System.out.println("3投目を投げます。投げる方向を選んでください。");
						System.out.println("1:左　2:右　3真ん中");
						consoleStop();
						course = scanner.nextInt();
						percent = new java.util.Random().nextInt(11);
						if (course == 1 || course == 2) {
							score[i][2] = (int) (percent * 0.9);
							truecourse = 3;
						} else {
							score[i][2] = (int) (percent * 1.3);
							truecourse = new java.util.Random().nextInt(2) + 1;
						}
						if (score[i][2] >= 10) {
							System.out.println("-----------------------------");
							System.out.println("💮おめでとう！ストライク！💮");
							System.out.println("-----------------------------");
							consoleStop();
							score[i][2] = 10;
							sum[i] = 30;
						} else {
							System.out.println(score[i][2] + "本倒しました");
							consoleStop();
							sum[i] = score[i][0] + score[i][1] + score[i][2];
						}
					} else {
						System.out.println(score[i][1] + "本倒しました");
						consoleStop();
						System.out.println("3投目を投げます。投げる方向を選んでください。");
						consoleStop();
						System.out.println("1:左　2:右　3真ん中");
						consoleStop();
						course = scanner.nextInt();
						percent = new java.util.Random().nextInt(11 - score[i][1]);
						if (course == truecourse) {
							score[i][2] = (int) (percent * 1.3);
						} else {
							score[i][2] = (int) (percent * 0.9);
						}
						if (score[i][1] + score[i][2] >= 10) {
							System.out.println("-----------------------------");
							System.out.println("★スペア！★");
							System.out.println("-----------------------------");
							consoleStop();
							score[i][2] = 10 - score[i][1];
							sum[i] = 20;
						} else {
							System.out.println(score[i][2] + "本倒しました");
							consoleStop();
							System.out.println("合計" + (score[i][1] + score[i][2]) + "本倒しました");
							consoleStop();
							sum[i] = score[i][0] + score[i][1] + score[i][2];
						}
					}
				} else if (sum[i] == 10) {
					System.out.println("3投目を投げます。投げる方向を選んでください。");
					consoleStop();
					System.out.println("1:左　2:右　3真ん中");
					consoleStop();
					course = scanner.nextInt();
					percent = new java.util.Random().nextInt(11);
					if (course == 1 || course == 2) {
						score[i][2] = (int) (percent * 0.9);
						truecourse = 3;
					} else {
						score[i][2] = (int) (percent * 1.3);
						truecourse = new java.util.Random().nextInt(2) + 1;
					}
					if (score[i][2] >= 10) {
						System.out.println("-----------------------------");
						System.out.println("💮おめでとう！ストライク！💮");
						System.out.println("-----------------------------");
						consoleStop();
						score[i][2] = 10;
						sum[i] = 20;
					} else {
						System.out.println(score[i][2] + "本倒しました");
						consoleStop();
						sum[i] = score[i][0] + score[i][1] + score[i][2];
					}
				}
			}

			if (i != 0) {
				if (score[i - 1][0] == 10) {
					if (i != 1 && score[i - 2][0] == 10) {
						sum[i] = sum[i] + score[i][0];
					}
					sum[i] = sum[i] + score[i][0] + score[i][1];
				} else if (sum[i - 1] == 10) {
					sum[i] += score[i][0];
				}
			}

			total += sum[i];
			System.out.println("現在のあなたのスコア:" + total);
			
			consoleStop();
			System.out.println("対戦相手のターン");
			 consoleStop();
			mechascore[i][0] = new java.util.Random().nextInt(11);
			if (mechascore[i][0] >= 10) {
				System.out.println("-----------------------------");
				System.out.println("ストライク( ;∀;)");
				System.out.println("-----------------------------");
				consoleStop();
				mechascore[i][0] = 10;
				mechasum[i] = 10;
			} else {
				System.out.println("1投目は"+mechascore[i][0] + "本倒しました");
				consoleStop();
				mechascore[i][1] = new java.util.Random().nextInt(11-mechascore[i][0]);
				if (mechascore[i][0] + mechascore[i][1] >= 10) {
					System.out.println("-----------------------------");
					System.out.println("スペア('_')");
					System.out.println("-----------------------------");
					consoleStop();
					mechascore[i][1] = 10 - mechascore[i][0];
					mechasum[i] = 10;
				} else {
					System.out.println("2投目は"+mechascore[i][1] + "本倒しました");
					consoleStop();
					mechasum[i] = mechascore[i][0] + mechascore[i][1];
					System.out.println("合計" + mechasum[i] + "本倒しました");
					consoleStop();
				}
			}
			if (i == game-1) {
				if (mechascore[i][0] == 10) {
					mechascore[i][1] = new java.util.Random().nextInt(11);
					if (mechascore[i][1] >= 10) {
						System.out.println("-----------------------------");
						System.out.println("2投目もストライク！( ;∀;)");
						System.out.println("-----------------------------");
						consoleStop();
						mechascore[i][1] = 10;
						mechasum[i] = 20;
						mechascore[i][2] = new java.util.Random().nextInt(11);
						if (mechascore[i][2] >= 10) {
							System.out.println("-----------------------------");
							System.out.println("3連続ストライク！(>_<)");
							System.out.println("-----------------------------");
							consoleStop();
							mechascore[i][2] = 10;
							mechasum[i] = 30;
						} else {
							System.out.println(mechascore[i][2] + "本倒しました");
							consoleStop();
							mechasum[i] = mechascore[i][0] + mechascore[i][1] +mechascore[i][2];
						}
					} else {
						System.out.println(mechascore[i][1] + "本倒しました");
						consoleStop();
						mechascore[i][2] = new java.util.Random().nextInt(11-mechascore[i][0]);
						if (mechascore[i][1] + mechascore[i][2] >= 10) {
							System.out.println("-----------------------------");
							System.out.println("スペア('_')");
							System.out.println("-----------------------------");
							consoleStop();
							mechascore[i][2] = 10 - mechascore[i][1];
							mechasum[i] = 20;
						} else {
							System.out.println(mechascore[i][2] + "本倒しました");
							consoleStop();
							System.out.println("合計" + (mechascore[i][1] + mechascore[i][2]) + "本倒しました");
							consoleStop();
							mechasum[i] = mechascore[i][0] + mechascore[i][1] + mechascore[i][2];
						}
					}
				} else if (mechasum[i] == 10) {
					mechascore[i][2] = new java.util.Random().nextInt(11);
					if (mechascore[i][2] >= 10) {
						System.out.println("-----------------------------");
						System.out.println("2投目もストライク！( ;∀;)");
						System.out.println("-----------------------------");
						consoleStop();
						mechascore[i][2] = 10;
						mechasum[i] = 20;
					} else {
						System.out.println(mechascore[i][2] + "本倒しました");
						consoleStop();
						mechasum[i] = mechascore[i][0] + mechascore[i][1] + mechascore[i][2];
					}
				}
			}

			if (i != 0) {
				if (mechascore[i - 1][0] == 10) {
					if (i != 1 && mechascore[i - 2][0] == 10) {
						mechasum[i] = mechasum[i] + mechascore[i][0];
					}
					mechasum[i] = mechasum[i] + mechascore[i][0] + mechascore[i][1];
				} else if (mechasum[i - 1] == 10) {
					mechasum[i] += mechascore[i][0];
				}
			}
			mechatotal += mechasum[i];
			System.out.println("現在の対戦相手のスコア:" + mechatotal);
			
			
			// TODO 自動生成されたメソッド・スタブ

		}
		if(total>mechatotal) {
			System.out.println("-----------------------------");
			System.out.println("🌸おめでとう！！あなたの勝ち！！🌸");
			System.out.println("-----------------------------");
		}else if(total==mechatotal) {
			System.out.println("-----------------------------");
			System.out.println("引き分けです(^^)/");
			System.out.println("-----------------------------");
		}else {
			System.out.println("-----------------------------");
			System.out.println("残念…あなたの負けです(>_<)");
			System.out.println("-----------------------------");
		}
		scanner.close();
	}
	
	static void consoleStop() {
		try {
			 Thread.sleep(1000); // 2秒(1000ミリ秒)間だけ処理を止める
			} catch (InterruptedException e) {
			}
	}


}
