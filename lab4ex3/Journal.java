package lab4ex3;

public class Journal extends WrittenItem {
	
	private int year;
	
	Journal(){
		
	}
	
	public Journal(int idno, int copies, String title,String author, int year)
	{
		super(idno, copies, title, author);
		this.year = year;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void print()
	{
		System.out.println("Id No : "+getIdno()+"\n"+"Copies : "+getCopies()+"\n"+"Author : "+getAuthor()+"\n"+"Year :"+getYear());	
	}
	


}
