package java25;

public class Member {
	String id;
	Member(String color){
		this.id=color;
	}
	public int hashCode() {
		return id.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member mem= (Member) obj;
			if (id==mem.id) {
				return true;
			}
		}else return false;
		return false;
	}

	public String toString() {
		return id;
	}
	
	
}
