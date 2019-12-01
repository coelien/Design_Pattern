package decorator.tea;

public class AddMilkTea extends Favor {
	public AddMilkTea(Tea tea) {
		super(tea);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getTeaName() {
		// TODO Auto-generated method stub
		return "Milky "+super.getTeaName();
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()+5;
	}

}
