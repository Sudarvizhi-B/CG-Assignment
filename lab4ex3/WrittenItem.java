package lab4ex3;

public class WrittenItem extends Item{
	
	private String author;

	WrittenItem(){
		
	}
	public WrittenItem(int idno, int copies, String title,String author) {
		super(idno, copies, title);
		setAuthor(author);
		
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
