package hello;

import java.util.List;

class CallMethod {
	public String retrunExceptionMsg(List<String> list, String select) {
		String returnStr = ""; // 반환할 리턴값 담을 변수
	   	String listStr= "";

		String connectStr = getConnectStr(select);
		String connectStr2 = "입니다.";

	   	String exceptionMsg=getExceptionMsgFrom(select);
		String exceptionMsg2=getExceptionMsg2From(select);
		String exceptionMsg3= getExceptionMsg3From(select);
		String exceptionMsg4=getExceptionMsg4From(select);

		int lengthSize = getLengthSize(select);  //이름 길이 변수 초기화

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
			}
		}

		if("".equals(returnStr)){
			if(select.equals("fruit")||select.equals("trip")||select.equals("food")){
				for (int i = 0; i < list.size(); i++) {
					if (i < list.size() - 1) {
						listStr += list.get(i) + ",";
					} else {
						listStr += list.get(i);
					}
				}
			}
			returnStr = connectStr + listStr + connectStr2 + "\n"; // 내가 좋아하는~ 목록은 ~ 입니다.
		}
		return returnStr;
   }

	private int getLengthSize(String select) {
		if ("fruit".equals(select)) {
			return 5;
		}else if("food".equals(select)){
			return 10;
		}else if("trip".equals(select)){
			return 15;
		}
		return 0;
	}

	private String getConnectStr(String select) {
		if ("fruit".equals(select)) {
			return "내가 좋아하는 과일 목록은 ";
		}else if("food".equals(select)){
			return "내가 좋아하는 음식 목록은 ";
		}else if("trip".equals(select)){
			return "내가 좋아하는 여행 목록은 ";
		}else{
			return "";
		}
	}

	private String getExceptionMsgFrom(String select) {
		if ("fruit".equals(select)) {
			return  "과일 갯수는 최소 2개 이상이어야 합니다\n";
		} 	else if ("food".equals(select)) {
			return  "음식 갯수는 최소 2개 이상이어야 합니다\n";
		} 	else if ("trip".equals(select)) {
			return  "여행지는 최소 2개 이상이어야 합니다\n";
		} else {
			return "";
		}
	}

	private String getExceptionMsg2From(String select) {
		if ("fruit".equals(select)) {
			return  "과일 갯수는 최대 10개 까지만 가능합니다\n";
		} 	else if ("food".equals(select)) {
			return  "음식은 최대 10개 까지만 가능합니다.\n";
		} 	else if ("trip".equals(select)) {
			return  "여행지 이름은 10글자 까지만 가능합니다\n";
		} else {
			return "";
		}
	}

	private String getExceptionMsg3From(String select) {
		if ("fruit".equals(select)) {
			return "과일 이름은 5글자 까지만 가능합니다\n";
		} 	else if ("food".equals(select)) {
			return "음식 이름은 15글자 까지만 가능합니다.\n";
		} 	else if ("trip".equals(select)) {
			return  "여행지 이름은 10글자 까지만 가능합니다\n";
		} else {
			return "";
		}
	}

	private String getExceptionMsg4From(String select) {
		if ("fruit".equals(select)) {
			return  "과일 이름을 입력해야 합니다.\n";
		} 	else if ("food".equals(select)) {
			return  "음식 이름을 입력해야 합니다.\n";
		} 	else if ("trip".equals(select)) {
			return "여행지 이름을 입력해야 합니다\n";
		} else {
			return "";
		}
	}
}