
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sertar sertar1 = new Sertar(30, 50, 40);
		Sertar sertar2 = new Sertar(35, 60, 30);
		Birou birou = new Birou(70, 110, 80, sertar1, sertar2);
		
		birou.tipareste();
	}

}
