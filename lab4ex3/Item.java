package lab4ex3;

public class Item {
	
	private int idno;
	private int copies;
	private String title;
	Item(){
		
	}
	public Item(int idno, int copies, String title) {
		this.idno = idno;
		this.copies = copies;
		this.title = title;
	}
	
	
	public int getIdno() {
		return idno;
	}
	
	public void setIdno(int idno) {
		this.idno = idno;
	}
	
	public int getCopies() {
		return copies;
	}
	
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
}
