package hello;

import java.util.ArrayList;
import java.util.List;

public class CreateMethod {

	public static void main(String[] args) {
     	CallMethod call= new CallMethod(); //CallMethod 객체 생성
		List<String> fruitList = new ArrayList<String>(); //과일 리스트
		List<String> tripList = new ArrayList<String>(); // 여행 리스트 

		//과일 리스트
		fruitList.add("포도");
	    fruitList.add("사과");
	    fruitList.add(null);
	    fruitList.add("수박");
		fruitList.add("포도");

		//여행지 리스트
		tripList.add("한국asdasd");
		tripList.add("한국");
		tripList.add("한국");

	    System.out.print(call.retrunExceptionFruitMsg(fruitList,"fruit")); //fruit 함수 호출
	    System.out.print(call.retrunExceptionFruitMsg(tripList,"trip")); //fruit 함수 호출

	}
}


