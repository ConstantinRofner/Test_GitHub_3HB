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
		n.addLikes();
		p.addLikes();
		p.addLikes();
		
		//adds three comments, which contain the String
		String comment = "XYZ";
		p.addCommentary(comment);
		p.addCommentary(comment);
		n.addCommentary(comment);

	}

}