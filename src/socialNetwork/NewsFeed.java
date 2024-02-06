package socialNetwork;

import java.util.ArrayList;

public class NewsFeed {

	private ArrayList <News> news;

	public NewsFeed() {
		this.news = new ArrayList<News>();
	}
	
	public ArrayList<News> getNews() {
		return news;
	}
	public void setNews(ArrayList<News> news) {
		this.news = news;
	}
	
	/**
	 *Method adds all news to the ArrayList<News> 
	 * @param n
	 */
	public void add(News n) {
		if (!this.news.contains(n)) {
			this.news.add(n);
		}
	}
	
	/**
	 * Method removes those News from the ArrayList<News>
	 * @param n
	 */
	public void remove(News n) {
		this.news.remove(n);
	}
	
	/**
	 * Method searches for all authors who are in the ArrayList
	 * @param author
	 */
	
	public void print() {
		for (News n : this.news) {
			System.out.println(n);
		}
	}
	
	/**
	 * 
	 * @param author
	 */
	public void search(String author) {
		ArrayList <News> searchByAuthor = new ArrayList<News>();
		for (News n : this.news) {
			if (n.getAuthor().equals(author)) {
				searchByAuthor.add(n);
			}
		}
		System.out.println(searchByAuthor);
	}
	
	/**
	 * 
	 * @param author
	 */
	public void searchNews(String author) {
		ArrayList <News> searchNews = new ArrayList<News>();
		for (News n : this.news) {
			if (n.getAuthor().equals(author) && n instanceof NewsCast) {
				searchNews.add(n);
			}
		}
		System.out.println(searchNews);
	}
}