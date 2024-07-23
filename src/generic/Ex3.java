package generic;

public class Ex3 {

	public static void main(String[] args) {
		
		//파우더를 사용하는 프린터기 생성
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>();
		printer1.setMeterial(new Powder());
		Powder powder = printer1.getMeterial(); //재료를 꺼낼 때 Powder가 반환됨
		powder.doPrinting();
		
		
		//플라스틱을 사용하는 프린터기 생성
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>();
		printer2.setMeterial(new Plastic());
		Plastic plastic = printer2.getMeterial();
		plastic.doPrinting();
		
	}

}

class ThreeDPrinter<T> { // 다이아몬드 연산자안에 문자T 작성
	private T meterial; // Object대신 문자T 작성 (문자 이름은 아무거나 상관없음)

	public T getMeterial() {
		return meterial;
	}

	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}

}