package defaults;

public class ScanResult {    //port scanner를 만들기위한 port를 가져올라고
	private int port;
	private boolean isOpen;
	
	public ScanResult(int port, boolean isOpen) {
		super();
		this.port = port;
		this.isOpen = isOpen;
	}
	
	public int getPort() {				//getters and setters 읽거나 쓰게 해주는 것
		return port;
	}
	
	public void setPort(int port) {		//getters and setters 읽거나 쓰게 해주는 것
		this.port = port;
	}
	
	public boolean isOpen() {			//열려있는지 확인하는 것	isopen이 return되어서 값을 읽는것
		return isOpen;
	}
	
	public void setOpen(boolean isOpen) {//open를 덮어 쓰는것
		this.isOpen = isOpen;
	}
	
}
