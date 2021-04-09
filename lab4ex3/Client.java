package lab4ex3;

public class Client {

	public static void main(String[] args) {
				Book book = new Book(8, 7, "Euphoria", "Jungkook");
				Journal journal = new Journal(18, 7, "Just Dance" ,"Jung Hoseok", 1995);
				CD cd = new CD("Kim Taehyung" , "Romantic Comedy");
				Video video = new Video("Namjoonie", "Thiller",1994);
				book.print();
				journal.print();
				cd.print();
				video.print();
				System.out.print(cd.getArtist());
	}

}
