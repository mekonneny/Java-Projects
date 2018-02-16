/*Yonathan Mekonnen
  Date Structures and Object Programming (CMSC 256)
  Eclipse
  Program 2
  Purpose: Prompt the user to enter either S or I to see a display of all of the DigitalMedia of that type in alphabetical order
   */

public class Song extends DigitalMedia implements Comparable<Song> {

	private String artistName;
	private String album;
	// Create Parameterized Constructor
	public Song(String name, String artistName, String album, long size) {
		super(name, size);
		setArtistName(artistName);
		setAlbum(album);
	}
	// Use get method to return what you set the parameter in the set method
	public String getArtistName() {
		return artistName;
	}

	public String getAlbum() {
		return album;
	}
	// set the global variable type to the parameter in the set method
	public void setArtistName(String ArtistName) {
		if (ArtistName == null) {
			throw new NullPointerException("Try again ");
		} else {
			this.artistName = ArtistName;
		}
	}

	public void setAlbum(String Album) {
		if (Album == null) {
			throw new NullPointerException("Try again ");
		} else {
			this.album = Album;

		}
	}
// creating compareTo method
	public int compareTo(Song other) {
		if (this.getAlbum().toUpperCase().compareTo(other.getAlbum().toUpperCase()) > 0) {
			return 1;
		} else if (this.getAlbum().toUpperCase().compareTo(other.getAlbum().toUpperCase()) < 0) {
			return -1;
		} else
			return super.getName().compareTo(other.getName());
		
	}

	@Override
	//creating equals method
	public boolean equals(Object obj) {
		if (obj == this) 
			return true;	
		if (obj == null) 
			return false;
		if (!(obj instanceof Song)) {
			Song next = (Song) obj;		
			if (super.getName().equals(next.getName())) {
				if (this.album.equals(next.getAlbum())) {
					if (this.artistName.equals(next.getArtistName())) {
						if (super.getSize() == next.getSize()) 
							return true;
					}
				}
			}
		}
		return false;
	}
		// creating toString method
		public String toString()  {
			int index = getName().indexOf(".");
			String output = "Title: " + getName().substring(0, index) + "\n" + "Artist: " + getArtistName() + "\n" + "Album: " + getAlbum() + "\n";
	
			return output;
	}


}
