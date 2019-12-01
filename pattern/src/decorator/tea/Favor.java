package decorator.tea;

public class Favor implements Tea {
	private Tea tea;
	public Favor(Tea tea) {
		this.tea = tea;
	}
	@Override
	public String getTeaName() {
		// TODO Auto-generated method stub
		return tea.getTeaName();
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return tea.getPrice();
	}
	
	
}
