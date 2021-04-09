package lab4ex3;

public class Book extends WrittenItem {
	
	public Book(int idno, int copies, String title,String author)
	{
		super(idno,copies,title,author);
	}
	
	public void print() {
		System.out.println("Id No : "+getIdno()+"\n"+"Copies : "+getCopies()+"\n"+"Title : "+getTitle()+"\n"+"Author : "+getAuthor());
	}

}
