package hello;

import java.util.ArrayList;
import java.util.List;

public class Helloworld {

	public String returnStr(List<String> listA) { // 문자열 반환하는 함수

		String restr = ""; // 반환할 리턴값 담을 변수
		String stro = ""; // list 값을 담을 String 변수
		String allStr = "";// 과일값들 출력할 문자열 변수

		String outputStr = "내가 좋아하는 과일 목록은 ";
		String outputStr2 = "입니다.";

		for (int i = 0; i < listA.size(); i++) {
			if (i < listA.size() - 1) {
				stro += listA.get(i) + ",";
			} else {
				stro += listA.get(i);
			}
		}

		allStr = outputStr + stro + outputStr2 + "\n"; // 내가 좋아하는 과일목록은 ~ 입니다.

		String str = "과일 갯수는 최소 2개 이상이어야 합니다\n";
		String str2 = "과일 갯수는 최대 10개 까지만 가능합니다\n";

		String str3 = "과일 이름은 5글자 까지만 가능합니다\n";
		String str4 = "과일 이름을 입력해야 합니다\n";

		if (listA.size() < 2) { // 과일 갯수가 최소 2개 이상인 경우
			restr = str; // 과일 갯수는 최소 2개 이상이어야 합니다.

		} else if (listA.size() > 10) { // 과일 갯수가 10개 이상인 경우
			restr = str2; // 과일 갯수는 최대 10개 까지만 가능합니다.
		}

		else {

			for (int i = 0; i < listA.size(); i++) {
				if (listA.get(i).trim().length() == 0||listA.get(i) == null) {  //공백 처리
					restr = i + 1 + "번째 " + str4;

				} else if (listA.get(i).length() > 5) { // 과일 이름이 5자 이상이라면
					restr = str3; // 과일 이름은 5글자 까지만 가능합니다.

				}

			}
		}
		return restr; // 음식을 담은 값과 예외처리 리턴값을 반환

	}

	public static void main(String[] args) {
		Helloworld LE = new Helloworld();
		List<String> listA = new ArrayList<String>();
		listA.add("사오오오오오");
	    listA.add("사");
        //listA.add("사과");
	    //listA.add("사과");
	    //listA.add("사과");
		//listA.add("사과");
		//listA.add("사과");

		System.out.println(LE.returnStr(listA)); // 함수 호출

	}

}
