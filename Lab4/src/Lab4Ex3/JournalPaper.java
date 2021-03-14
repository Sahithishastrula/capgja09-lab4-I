package Lab4Ex3;

public class JournalPaper extends WrittenItem {
	private int year_of_publish;

	public JournalPaper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JournalPaper(int uniqueId, String title, int no_of_copies, String author,int yearp) {
		super(uniqueId, title, no_of_copies, author);
		// TODO Auto-generated constructor stub
		this.year_of_publish=yearp;
	}

	public int getYear_of_publish() {
		return year_of_publish;
	}

	public void setYear_of_publish(int year_of_publish) {
		this.year_of_publish = year_of_publish;
	}
	
	
}
