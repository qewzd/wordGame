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
			cnt = 0;   // �ʱ�ȭ
			int score = 0;  // ����
			String[] fail = new String[5];   // Ʋ���ܾ� ����
			System.out.print("Start!(enter�� ��������)");
			String b = s.nextLine();  // ���α׷��� ����
			System.out.println("���ܾ��� ���縵��  �Է��ϼ���.");
			
			for(int i=0; i<a.length;i++) {
				achk[i]=0;
			}

			for (int c = 0; c < 5; c++) {    // 5���� �Ѵ�
				
				
				while (true) {
					num = r.nextInt(a.length);
					d = a[num];  // ���� �ܾ� ��������  >   a�迭�� �ε����� �������� ����Ѵ�.. 
					achk[num] ++; 
					if(achk[num]>1) {
					continue;
				}else 
					achk[num] ++; 
					break;
				
				}
				
				
					System.out.println(d);   // �ܾ� ���
				b = s.nextLine();                                                          //    01234
				for (int i = 0; i < d.length() ; i++) {   // �������� ���� ��� ���� ��ū �ݺ� i 0 1 2 3 4   apple
					if(i == b.length()) {   // i���� Ű����� �Է��� ���̶� ������ ��.                        app
						break;  // ���� �ݺ��� ����..
					}
					if (d.charAt(i) == b.charAt(i)) {  // i������ ���ôܾ�� �Է´ܾ��� �� �ڸ����� ��...
						score += 5;  // ���ڸ��� ��ġ �Ҷ� ���� +5���� �ش�..   �� ������ �� 15��
					}
				}
				if (!d.equals(b)) {      //  �� �ܾ��� ���� ���� �ʴٸ�
					cnt++;                     //cnt��� ���� ����.. �Ѵ�? ���� cnt�� ���� ����? �Ѿ� ���´�.. 
					fail[c] = d;               // fail�̶�� �迭�� c�� �ε����� ���ôܾ �����ϰڴ�..   �̶� 37�� ������ 
					                           // �ڵ��� �ǵ��� �����Ѵ�.. Ʋ���ܾ� �����ϴ� ����.. 
				}
			}

			System.out.print("������������" + score + "��");
			if (score >= 150) {
				System.out.println("A�Դϴ�.");
			} else if (score < 150 && score >= 140) {
				System.out.println("B�Դϴ�.");
			} else if (score < 140 && score >= 130) {
				System.out.println("C�Դϴ�.");
			} else if (score < 130 && score > 100) {
				System.out.println("D�Դϴ�.");
			} else {
				System.out.println("F�Դϴ�.");
			}

			System.out.println("�׸��ϰ� �ʹٸ� ���Ḧ,�ٽ��ϱ� ���ϽŴٸ� �ٽ��ϱ⸦,Ʋ���ܾ �����Ͻð� �ʹٸ� ������ �Է����ּ���.");
			b = s.nextLine();
			if (b.equals("����")) {
				break;
			} else if (b.equals("�ٽ��ϱ�")) {
				continue;
			} else if (b.equals("����")) {
				if (cnt == 0) {   //cnt�� ���� ���⼭ ������..   cnt�� Ʋ�� �ܾ��� ��... 
					System.out.println("������ �����ϴ�.�׸��ϰ� �ʹٸ� ���Ḧ,�ٽ��ϱ� ���ϽŴٸ� �ٽ��ϱ⸦ �Է����ּ���");
					b = s.nextLine();
					if (b.equals("����")) {
						break;
					} else if (b.equals("�ٽ��ϱ�")) {
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
					System.out.println("�׸��ϰ� �ʹٸ� ���Ḧ,�ٽ��ϱ� ���ϽŴٸ� �ٽ��ϱ⸦ �Է����ּ���");
					b = s.nextLine();
					if (b.equals("����")) {
						break;
					} else if (b.equals("�ٽ��ϱ�")) {
						continue;
					}

				
			}

		}
	
		}





		
		}
	}



	



