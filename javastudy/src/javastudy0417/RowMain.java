package javastudy0417;

public class RowMain {

	public static void main(String[] args) {
		// 3개의 Row 데이터를 저장할 배열을 생성
		// 1개의 자료형 [] 배열이름 = new 1개의 자료형 [개수];
		Row[] data = new Row[3];
		// 기본형 배열이 아니므로 인스턴스를 직접 생성해서 대입
		data[0] = new Row();
		data[0].setName("배기훈");

		data[1] = new Row();
		data[1].setName("임성현");

		data[2] = new Row();
		data[2].setName("배성민");

		// 배열의 데이터 출력
		for (int i = 0; i < data.length; i = i + 1) {
			Row imsi = data[i];
			System.out.println(imsi.getNum() + ":" + imsi.getName());
		}
	}

}
