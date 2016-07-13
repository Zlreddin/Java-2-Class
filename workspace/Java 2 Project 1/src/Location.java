import java.util.ArrayList;

public class Location {
	private Restaurant rest = new Restaurant();

	String locName = "The Circle";
	{
	}

	public ArrayList<String> restArray = new ArrayList<>();
	{
		restArray.add("Restaurant1");
		restArray.add("Restaurant2");
		restArray.add("Restaurant3");
		restArray.add("Restaurant4");
	}

	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public ArrayList<String> getRestArray() {
		return restArray;
	}

	public void setRestArray(ArrayList<String> restArray) {
		this.restArray = restArray;
	}

	public String getRestName() {
		return rest.restName;
	}

	public void setRestName(String restName) {
		this.rest.restName = restName;
	}

	public Entrée[] getEntarray() {
		return rest.entarray;
	}

	public void setEntarray(Entrée[] entarray) {
		this.rest.entarray = entarray;
	}

	public int getArraylen() {
		return rest.arraylen;
	}

	public void setArraylen(int arraylen) {
		this.rest.arraylen = arraylen;
	}
	
	

}