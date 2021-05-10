package java08_abstract.interfaceEx;

interface InterA {
	public abstract void getA();
}
interface InterB {
	public abstract void getB();
}
	interface InterC extends InterA, InterB{//인터페이스끼리 상속엔 extends
	public abstract void getC();
}

//class Child03 implements InterA, InterB, InterC{
class Child03 implements InterC {

	@Override
	public void getC() {
	}

	@Override
	public void getB() {
	}
	@Override
	public void getA() {	
	}
	
}

public class InterfaceEx_03 {
	public static void main(String[] args) {
		
	}

}




