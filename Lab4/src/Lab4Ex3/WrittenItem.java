package Lab4Ex3;

public abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WrittenItem(int uniqueId, String title, int no_of_copies,String author) {
		super(uniqueId, title, no_of_copies);
		// TODO Auto-generated constructor stub
		this.author=author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

	
}
