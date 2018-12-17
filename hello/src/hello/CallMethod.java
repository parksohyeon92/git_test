package hello;

import java.util.List;

class CallMethod {

	public String retrunExceptionFruitMsg(List<String> list, String select) {
		String returnStr = ""; // 반환할 리턴값 담을 변수
	   	String fruitStr= ""; // 과일 값을 담을 String 변수

	   	String exceptionMsg="";
		String exceptionMsg2="";
		String exceptionMsg3= "";
		String exceptionMsg4="";


	 	if(select.equals("fruit")){
		 exceptionMsg = "과일 갯수는 최소 2개 이상이어야 합니다\n";
		 exceptionMsg2 = "과일 갯수는 최대 10개 까지만 가능합니다\n";
		 exceptionMsg3 = "과일 이름은 5글자 까지만 가능합니다\n";
		 exceptionMsg4 = "과일 이름을 입력해야 합니다\n";
	 	}
		else if(select.equals("trip")){
		  exceptionMsg = "여행지는 최소 2개 이상이어야 합니다\n";
		  exceptionMsg2 = "여행지는 최대 10개 까지만 가능합니다\n";
		  exceptionMsg3 = "여행지 이름은 5글자 까지만 가능합니다\n";
		  exceptionMsg4 = "여행지 이름을 입력해야 합니다\n";
		}


		if (list.size() < 2) {
			returnStr = exceptionMsg;
		} else if (list.size() > 10) {
			returnStr = exceptionMsg2;
		}

		else {
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i) == null){
					returnStr = i + 1 + "번째 " + exceptionMsg4;

				}
				else if (list.get(i).trim().length() == 0) {
					returnStr = i + 1 + "번째 " + exceptionMsg4;
					System.out.println("공백체크");
				} else if (list.get(i).length() > 5) {
					returnStr =exceptionMsg3;
    			}
			}
		}
		return returnStr;
   }
}