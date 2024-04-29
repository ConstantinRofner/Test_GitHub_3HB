package String_StringBuilder;

public class HTMLStrings {
	
	public String htmlElement(String tag, String body){
		if(tag == null || tag.isBlank()) {
			return body;
		}else if(body.isBlank()){
			return "<" + tag + ">" + "<" + "/" + tag + ">";
		}else if(body.isBlank() && (tag.isBlank() || tag == null)) {
			
		}
	}
	public static void main(String[] args) {
		
	}
}