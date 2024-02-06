package socialNetwork;

public class Test {

	public static void main(String[] args) {
		NewsFeed nf = new NewsFeed();
		
		News n = new NewsCast("Constantin", "TESTTEXT TESTTEXT");
		News p = new PhotoCast("Constantin", "image1.png", "Class Photo");
		
		//Hinzufügen zu News
		nf.add(n);
		nf.add(p);
		
		//Erhöhen der Like-Anzahl
		n.addLikes();
		p.addLikes();
		p.addLikes();
	}

}