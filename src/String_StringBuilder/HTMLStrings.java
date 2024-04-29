package String_StringBuilder;

public class HTMLStrings {
	
	public String htmlElement(String tag, String body){
		if(body == null && (tag.isBlank() || tag == null)) {
			return "";
		}else if(tag == null || tag.isBlank()) {
			return body;
		}else if(body == null){
			return "<" + tag + ">" + "<" + "/" + tag + ">";
		}else {
			return "<" + tag + ">" + body + "<" + "/" + tag + ">";
		}
	}
	public static void main(String[] args) {
		
	}
}