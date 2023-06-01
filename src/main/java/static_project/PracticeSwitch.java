package static_project;

public class PracticeSwitch {

	public static void main(String[] args) {
		int[] jobNum = new int[10];
		for (int i = 0; i < 10; i++) {
			jobNum[i] = i + 1;
		}
		
		for (int num : jobNum) {
			switch (num) {
			case 1:
				System.out.println("勇者");
				break;
			case 2:
				System.out.println("バトルマスター");
				break;
			case 3:
				System.out.println("パラディン");
				break;
			case 4:
				System.out.println("海賊");
				break;
			case 5:
				System.out.println("魔法剣士");
				break;
			default:
				System.out.println("モンスター");
				break;
			}
		}
		
	}

}
