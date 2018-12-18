package hello;

import java.util.ArrayList;
import java.util.List;

public class CreateMethod {

	public static void main(String[] args) {
     	CallMethod call= new CallMethod(); //CallMethod 객체 생성
		List<String> fruitList = new ArrayList<String>(); //과일 리스트
		List<String> tripList = new ArrayList<String>(); // 여행 리스트
		List<String> foodList = new ArrayList<String>(); //음식 리스트

		//과일 리스트
		fruitList.add("과일");
		fruitList.add("과일");
		fruitList.add("과776657일");

		//여행지 리스트
		tripList.add(null);

		//음식 리스트
		foodList.add("음식");
		foodList.add("음식식");
		foodList.add("음식식식");

		System.out.print(call.retrunExceptionMsg(fruitList,"fruit")); //returnException 함수 호출
	    System.out.print(call.retrunExceptionMsg(tripList,"trip")); // returnException 함수 호출
	    System.out.print(call.retrunExceptionMsg(foodList,"food")); //returnException fruit 함수 호출
	}
}


