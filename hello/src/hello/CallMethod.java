package hello;

import java.util.List;

class CallMethod {

	public String retrunExceptionMsg(List<String> list, String select) {
		String returnStr = ""; // 반환할 리턴값 담을 변수
	   	String listStr= "";

		String connectStr = "내가 좋아하는 과일 목록은 ";
		String connectStr2 = "입니다.";

	   	String exceptionMsg="";
		String exceptionMsg2="";
		String exceptionMsg3= "";
		String exceptionMsg4="";


	   int lengthSize = 0;  //이름 길이 변수 초기화


	 	if(select.equals("fruit")){ //넘겨받은 스트링 값이 fruit일 경우
		 exceptionMsg = "과일 갯수는 최소 2개 이상이어야 합니다\n";
		 exceptionMsg2 = "과일 갯수는 최대 10개 까지만 가능합니다\n";
		 exceptionMsg3 = "과일 이름은 5글자 까지만 가능합니다\n";
		 exceptionMsg4 = "과일 이름을 입력해야 합니다\n";

		 lengthSize=5;

			for (int i = 0; i < list.size(); i++) {
				if (i < list.size() - 1) {
					listStr += list.get(i) + ",";
				} else {
					listStr += list.get(i);
				}
			}
	 	}
		else if(select.equals("trip")){ //넘겨받은 스트링 값이 trip일 경우
		  exceptionMsg = "여행지는 최소 2개 이상이어야 합니다\n";
		  exceptionMsg2 = "여행지는 최대 10개 까지만 가능합니다\n";
		  exceptionMsg3 = "여행지 이름은 10글자 까지만 가능합니다\n";//10
		  exceptionMsg4 = "여행지 이름을 입력해야 합니다\n";

		  lengthSize=10;
		  connectStr ="내가 좋아하는 여행지 목록은 ";

			for (int i = 0; i < list.size(); i++) {
				if (i < list.size() - 1) {
					listStr += list.get(i) + ",";
				} else {
					listStr += list.get(i);
				}
			}
		}
		else if(select.equals("food")){//넘겨받은 값이 food일 경우

	 	    connectStr ="내가 좋아하는 음식 목록은 ";

			exceptionMsg="음식 갯수는 최소 2개 이상이어야 한다\n";
			exceptionMsg2="음식은 최대 10개 까지만 가능합니다.\n";
			exceptionMsg3="음식 이름은 15글자 까지만 가능합니다.\n";
			exceptionMsg4="음식 이름을 입력해야 합니다.\n";

			 lengthSize=15;

			for (int i = 0; i < list.size(); i++) {
				if (i < list.size() - 1) {
					listStr += list.get(i) + ",";
				} else {
					listStr += list.get(i);
				}
			}

		}

	/*	if (list.size() < 2) {
			returnStr = exceptionMsg;
		} else if (list.size() > 10) {
			returnStr = exceptionMsg2;
		}	else {*/

			 for (int i = 0; i < list.size(); i++){
				if(list.get(i) == null){
					returnStr = i + 1 + "번째 " + exceptionMsg4;
				}else if (list.get(i).trim().length() == 0){
					returnStr = i + 1 + "번째 " + exceptionMsg4;
				}else if (list.get(i).length() > lengthSize) {
					returnStr =exceptionMsg3;
				}else if (list.size() < 2) {
					returnStr = exceptionMsg;
				} else if (list.size() > 10) {
					returnStr = exceptionMsg2;
				}else {
					returnStr = connectStr + listStr + connectStr2 + "\n"; // 내가 좋아하는~ 목록은 ~ 입니다.
				}
			 }
		return returnStr;
   }
}