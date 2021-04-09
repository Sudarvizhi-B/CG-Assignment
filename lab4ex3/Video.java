package lab4ex3;

public class Video extends MediaItem{
	
	private String director;
	private String genre;
	private int year;

	Video(){
	}
	Video(String director, String genre, int year){
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	void print()
	{
		System.out.println("Director name : "+getDirector()+"\n"
				+ "Genre : "+getGenre()+"\n"+"Released Year : "+getYear());
	}
	

}
