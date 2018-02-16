/*Yonathan Mekonnen
  Date Structures and Object Programming (CMSC 256)
  Eclipse
  Program 2
  Purpose: Prompt the user to enter either S or I to see a display of all of the DigitalMedia of that type in alphabetical order
 */

public class Image extends DigitalMedia implements Comparable<Image>
{
	private int width;
	private int height;
	// Create Parameterized Constructor
	public Image(String name, int width, int height, Long size)
{
        super(name, size);
		setWidth(width);
		setHeight(height);
}
	// Use get method to return what you set the parameter in the set method
	public int getWidth() { 
	return width;
}
	// set the global variable type to the parameter in the set method
	public void setWidth(int width) 
{        if (getWidth() >= 0) {
	this.width = width;
} else {
	throw new IllegalArgumentException("");
}
}
	// Use get method to return what you set the parameter in the set method
	public int getHeight() 
{
	return height;
}
	// set the global variable type to the parameter in the set method
	public void setHeight(int height) 
{        if (getHeight() >= 0) {
	this.height= height;
} else {
	throw new IllegalArgumentException("");
}

}
//Create compareTo method
	public int compareTo(Image other) {
		if (this.getName().toUpperCase().compareTo(other.getName().toUpperCase()) > 0) {
			return 1;
		} else if (super.getName().toUpperCase().compareTo(other.getName().toUpperCase()) < 0) {
			return -1;
		} else
			return 0;
	}


//Create equalsTo method
	public boolean equals(Object obj) {
		if (obj == this) 
			return true;
		if (obj == null) 
			return false;
		if (!(obj instanceof Image)) {
		Image next = (Image) obj;
		if (super.getName().equals(next.getName())){
		if (this.width == next.getWidth()) {
			if (this.height == next.getHeight())  {
				if (super.getSize() == next.getSize()) {
					
						return true;
				}
			}
			}
		}
		}
		return false;
	}

		//Create toString method
		@Override
		public String toString() 
	{
		String output = "Title: " + getName() + "\n" + "Width: " + getWidth() + "\n" + "Height: " + getHeight()+ "\n";
		return output;
	}
		
}

		