import java.util.Random;
import java.util.Scanner;

public class Day01 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub


		String[] a = { "culture", "experience", "education", "symbol", "effect", "liberty", "affair", "comfort",
				"tradition", "subject" };
		int[] achk = new int[a.length];
		char[] grade = { 'A', 'B', 'C', 'D', 'F' };
		int cnt = 0;
		int num;
		String d;

		Scanner s = new Scanner(System.in);
		Random r = new Random();

		while (true) {
			cnt = 0;   // 초기화
			int score = 0;  // 점수
			String[] fail = new String[5];   // 틀린단어 저장
			System.out.print("Start!(enter를 누르세요)");
			String b = s.nextLine();  // 프로그램의 시작
			System.out.println("영단어의 스펠링을  입력하세요.");
			
			for(int i=0; i<a.length;i++) {
				achk[i]=0;
			}

			for (int c = 0; c < 5; c++) {    // 5게임 한다
				
				
				while (true) {
					num = r.nextInt(a.length);
					d = a[num];  // 랜덤 단어 가져오기  >   a배열의 인덱스를 랜덤으로 출력한다.. 
					achk[num] ++; 
					if(achk[num]>1) {
					continue;
				}else 
					achk[num] ++; 
					break;
				
				}
				
				
					System.out.println(d);   // 단어 출력
				b = s.nextLine();                                                          //    01234
				for (int i = 0; i < d.length() ; i++) {   // 랜덤으로 뽑은 담어 길이 만큰 반복 i 0 1 2 3 4   apple
					if(i == b.length()) {   // i값이 키보드로 입력한 길이랑 같을때 참.                        app
						break;  // 현재 반복문 종료..
					}
					if (d.charAt(i) == b.charAt(i)) {  // i값으로 제시단어와 입력단어의 각 자리수를 비교...
						score += 5;  // 각자리가 일치 할때 마다 +5점을 준다..   위 예제는 총 15점
					}
				}
				if (!d.equals(b)) {      //  두 단어의 값이 같지 않다면
					cnt++;                     //cnt라는 것을 증가.. 한다? 샘도 cnt가 뭔지 몰라? 넘어 가는다.. 
					fail[c] = d;               // fail이라는 배열에 c번 인덱스에 제시단어를 저장하겠다..   이때 37번 라인의 
					                           // 코드의 의도를 이해한다.. 틀린단어 저장하는 구나.. 
				}
			}

			System.out.print("게임의점수는" + score + "로");
			if (score >= 150) {
				System.out.println("A입니다.");
			} else if (score < 150 && score >= 140) {
				System.out.println("B입니다.");
			} else if (score < 140 && score >= 130) {
				System.out.println("C입니다.");
			} else if (score < 130 && score > 100) {
				System.out.println("D입니다.");
			} else {
				System.out.println("F입니다.");
			}

			System.out.println("그만하고 싶다면 종료를,다시하길 원하신다면 다시하기를,틀린단어를 복습하시고 싶다면 오답을 입력해주세요.");
			b = s.nextLine();
			if (b.equals("종료")) {
				break;
			} else if (b.equals("다시하기")) {
				continue;
			} else if (b.equals("오답")) {
				if (cnt == 0) {   //cnt의 도는 여기서 이해함..   cnt는 틀린 단어의 수... 
					System.out.println("오답이 없습니다.그만하고 싶다면 종료를,다시하길 원하신다면 다시하기를 입력해주세요");
					b = s.nextLine();
					if (b.equals("종료")) {
						break;
					} else if (b.equals("다시하기")) {
						continue;
					}
				} else {
					for (int c = 0; c < 5; c++) {
						if (fail[c] == null) {
							System.out.print(" ");
						} else {
							System.out.print(fail[c]);
							System.out.println();
						}
					}
					System.out.println("그만하고 싶다면 종료를,다시하길 원하신다면 다시하기를 입력해주세요");
					b = s.nextLine();
					if (b.equals("종료")) {
						break;
					} else if (b.equals("다시하기")) {
						continue;
					}

				
			}

		}
	
		}





		
		}
	}



	



