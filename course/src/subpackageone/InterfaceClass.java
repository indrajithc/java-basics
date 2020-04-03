package course.src.subpackageone;

public class InterfaceClass implements Operation {

	@Override
	public int sum(int no1, int no2) {
		// TODO Auto-generated method stub
		return no1 + no2;
	}

	@Override
	public int sub(int no1, int no2) {
		// TODO Auto-generated method stub
		return no1 - no2;
	}

	@Override
	public double div(int no1, int no2) {
		// TODO Auto-generated method stub
		return no1 / no2;
	}

	@Override
	public double mul(int no1, int no2) {
		// TODO Auto-generated method stub
		return no1 * no2;
	}

}