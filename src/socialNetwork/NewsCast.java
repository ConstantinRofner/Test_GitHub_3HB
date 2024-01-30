package socialNetwork;

public class NewsCast extends News{

	private String textMessage;

	public NewsCast(String author, String textMessage) {
		this.setAuthor(author);
	}

	public String getTextMessage() {
		return textMessage;
	}
	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}
	
}