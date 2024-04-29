package String_StringBuilder;

import org.w3c.dom.html.HTMLElement;

public class HTMLStrings {
	
	public static String htmlElement(String tag, String body){
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
		System.out.println(htmlElement("null", "Eins"));
	}
}