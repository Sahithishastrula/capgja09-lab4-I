package Lab4Ex3;

public abstract class MediaItem extends Item {
	private int runtime;

	public MediaItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MediaItem(int uniqueId, String title, int no_of_copies,int runtime) {
		super(uniqueId, title, no_of_copies);
		// TODO Auto-generated constructor stub
		this.runtime=runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	
}
