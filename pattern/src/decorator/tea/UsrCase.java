package decorator.tea;

public class UsrCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea t= new RedTea();
		t = new AddMilkTea(t);
		System.out.println("Tea name: " + t.getTeaName());
		System.out.println("Tea price: " + t.getPrice());		
	}

}
