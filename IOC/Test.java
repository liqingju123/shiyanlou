package IOC;

public class Test {
	
	private Shiyanlou shiyanlouImpl;
	
	public String updateString(String name){
		
		return shiyanlouImpl.toUp(name);
		
	}

	public Shiyanlou getShiyanlouImpl() {
		return shiyanlouImpl;
	}

	public void setShiyanlouImpl(Shiyanlou shiyanlouImpl) {
		this.shiyanlouImpl = shiyanlouImpl;
	}

	
	
	
	
	
	

}
