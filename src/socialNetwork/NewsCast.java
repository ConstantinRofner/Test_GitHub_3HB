package socialNetwork;

import java.time.LocalDate;

public class NewsCast extends News{

	private String textMessage;

	public NewsCast(String author, String textMessage) {
		this.setAuthor(author);
		this.setTimestamp(LocalDate.now());
		this.setLikes(0);
		this.setComments(null);
		this.textMessage = textMessage;
	}
	
	public String getTextMessage() {
		return textMessage;
	}
	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}
	
	public String toString() {
		return super.toString() + 
			"\t Nachricht: " + this.textMessage + "\n";
	}

	@Override
	public void addLikes() {
		this.setLikes(getLikes()+1);		
	}
}