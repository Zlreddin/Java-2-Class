
public class Entrée {

	private String desc;
	private double price;
	private String title;

	public Entrée() {

		setDesc("");
		setPrice(0);
		setTitle("");

	}

	public Entrée(String d, String t, double p) {
		setDesc(d);
		setPrice(p);
		setTitle(t);

	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
