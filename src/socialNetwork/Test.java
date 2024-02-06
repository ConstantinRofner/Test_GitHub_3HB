package socialNetwork;

public class Test {

	public static void main(String[] args) {
		NewsFeed nf = new NewsFeed();
		
		News n = new NewsCast("Constantin", "TESTTEXT TESTTEXT");
		News p = new PhotoCast("Constantin", "image1.png", "Class Photo");
		
		//gets added to News
		nf.add(n);
		nf.add(p);
		
		//increases the amount of likes
		n.increaseLikes();
		p.increaseLikes();
		p.increaseLikes();
		
		//adds three comments, which contain the String
		String comment = "Comment Comment";
		p.addCommentary(comment);
		p.addCommentary(comment);
		n.addCommentary(comment);
		
		//searches for "Constantin"
		nf.search("Constantin");
		
		//searches for "Constantin" and then prints it all out
		nf.searchNews("Constantin");
		nf.searchPhotos("Constantin");
		nf.print();
	}
}