package Lab4Ex3;

public class Cd extends MediaItem {
	private String artist;
	private String genre;
	public Cd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cd(int uniqueId, String title, int no_of_copies, int runtime,String artist,String genre) {
		super(uniqueId, title, no_of_copies, runtime);
		// TODO Auto-generated constructor stub
		this.artist=artist;
		this.genre=genre;
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
	
	
	}
