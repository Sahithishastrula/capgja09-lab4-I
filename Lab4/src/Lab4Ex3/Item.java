package Lab4Ex3;

public abstract class Item {
	private int uniqueId;
	private String title;
	private int no_of_copies;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int uniqueId, String title, int no_of_copies) {
		super();
		this.uniqueId = uniqueId;
		this.title = title;
		this.no_of_copies = no_of_copies;
	}
	public int getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNo_of_copies() {
		return no_of_copies;
	}
	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}
	
}
