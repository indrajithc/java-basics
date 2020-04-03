package course.src.subpackagesix;

public class OpImplementation2  implements Operations {
	int x = 56;
	int y = 34;

	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x + y + 10;
	}

	@Override
	public int GetX() {
		// TODO Auto-generated method stub
		return x + 10;
    }
    

    public static void main(String[] args) {
        System.out.println("Default interface");

        System.out.println("X : " + new OpImplementation2().GetX());
        new OpImplementation2().display();
        // new OpImplementation1().displayText();
    }

}