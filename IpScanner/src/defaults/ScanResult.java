package defaults;

public class ScanResult {    //port scanner�� ��������� port�� �����ö��
	private int port;
	private boolean isOpen;
	
	public ScanResult(int port, boolean isOpen) {
		super();
		this.port = port;
		this.isOpen = isOpen;
	}
	
	public int getPort() {				//getters and setters �аų� ���� ���ִ� ��
		return port;
	}
	
	public void setPort(int port) {		//getters and setters �аų� ���� ���ִ� ��
		this.port = port;
	}
	
	public boolean isOpen() {			//�����ִ��� Ȯ���ϴ� ��	isopen�� return�Ǿ ���� �д°�
		return isOpen;
	}
	
	public void setOpen(boolean isOpen) {//open�� ���� ���°�
		this.isOpen = isOpen;
	}
	
}
