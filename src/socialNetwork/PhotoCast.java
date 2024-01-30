package socialNetwork;

import java.time.LocalDate;

public class PhotoCast extends News{

	private String photoFileName;
	private String photoHeadline;
	
	public PhotoCast(String author, String photoFileName, String photoHeadline) {
		this.setAuthor(author);
		this.setTimestamp(LocalDate.now());
		this.setLikes(0);
		this.setComments(null);
		this.photoFileName = photoFileName;
		this.photoHeadline = photoHeadline;
	}
	
	
}