package java25;

public class Memberto {
	private String id;
	private String name;
	public Memberto(String id, String name) {
		this.id=id;
		this.name=name;}	
	public String toString() {
		return id +" : " + name;
	}
}
