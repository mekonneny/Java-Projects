/*Yonathan Mekonnen
  Date Structures and Object Programming (CMSC 256)
  Eclipse
  Program 1
  Purpose: to design a class that models DigitalMedia
 */
   import java.time.LocalDateTime;

public class DigitalMedia {

	
	private String name = "unkown";
	private long size = 0;
	private LocalDateTime dateCreated = null;
	private LocalDateTime dateModified = null;

	// Create Parameterized Constructor
	public DigitalMedia(String name, long size) {
		setName(name);
		setSize(size);
		dateCreated = LocalDateTime.now();
		dateModified = LocalDateTime.now();
	}

	// Use get method to return what you set the parameter in the set method
	public String getName() {
		return name;
	}

	public long getSize() {
		return size;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public LocalDateTime getDateModified() {
		return dateModified;
	}

	// set the global variable type to the parameter in the set method
	public void setName(String Name) {
		
		if (Name == null || Name == "") {
			throw new NullPointerException("Try again ");
		}
		if (!Name.contains(".")) {
			throw new IllegalArgumentException("Try again");
		}
		if (Name.indexOf('.', Name.indexOf('.') + 1) != -1) {
			throw new IllegalArgumentException();
		}

		else {
			this.name = Name;
		}
	}

	public void setSize(long newSize) {
		if (newSize < 0) {
			throw new IllegalArgumentException("Try again");
		} else {
			size = newSize;
		}
	}

	public void setDateModified(LocalDateTime newDateModified) {
		if (newDateModified.isAfter(dateCreated)) {
			dateModified = newDateModified;
		} else {
			throw new IllegalArgumentException();

		}
	}
//creating equals method
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null) {
			return true;
		}
		if (obj instanceof DigitalMedia) {
			DigitalMedia next = (DigitalMedia) obj;
			if (this.name.equals(next.getName())) {
				if (this.size == next.getSize()) {
					return true;
				}
			}
		}
		return false;
	}
//creating toString method
	@Override
	public String toString() {
		return "DigitalMedia [name=" + name + ", size=" + size + ", dateCreated=" + dateCreated + ", dateModified="
				+ dateModified + "]";

	}
}
