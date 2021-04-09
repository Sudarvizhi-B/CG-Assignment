package lab4ex3;

public class CD extends MediaItem {
	
	private String artist;
	private String genre;
	
	public CD(String artist, String genre)
	{
		super();
		this.artist = artist;
		this.genre = genre;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	void print()
	{
		System.out.println("Artist : "+getArtist()+"\n"
				+ "Genre : "+getGenre());
	}



}
