package Lab4Ex3;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int year_of_release;
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Video(int uniqueId, String title, int no_of_copies, int runtime,String director, String genre,int year_of_release) {
		super(uniqueId, title, no_of_copies, runtime);
		// TODO Auto-generated constructor stub
		this.director=director;
		this.genre=genre;
		this.year_of_release=year_of_release;
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
	public int getYear_of_release() {
		return year_of_release;
	}
	public void setYear_of_release(int year_of_release) {
		this.year_of_release = year_of_release;
	}
	
	
}
