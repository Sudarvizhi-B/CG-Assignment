package lab4ex3;

public class MediaItem extends Item{
	
	private int runtime;
	
	MediaItem(){
		
	}

	public MediaItem(int idno, int copies, String title, int runtime)
	{
		super(idno, copies, title);
		this.runtime = runtime;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
}
