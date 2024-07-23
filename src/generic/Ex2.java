package generic;

public class Ex2 {

	public static void main(String[] args) {
		ThreeDPrinter3 printer = new ThreeDPrinter3();

		Powder p1 = new Powder(); // Powder를 재료로 선택
		
		printer.setMeterial(p1); // 매개변수가 자동으로 형변환됨 Object material = new Powder()

		Object object = printer.getMeterial();

		Powder p2 = (Powder) object;// 재료를 꺼낼때는 직접 형변환을 해야함.

		p2.doPrinting();
	}

}

class ThreeDPrinter3 {
	private Object meterial; // 자료형을 object로 선언하면 파우더와 플라스틱을 모두 저장할 수 있음

	public Object getMeterial() {
		return meterial;
	}

	public void setMeterial(Object meterial) {
		this.meterial = meterial;
	}

}