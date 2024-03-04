package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ManipulateLosses {
	
	private List<Double>list;
	public List trimNonGrowingNumbers() {
		this.list = new ArrayList<Double>();
	}
	
	public List<Double>getList(){
		return this.list;
	}
	
	public void setList(List<Double>list) {
		this.list = list;
	}
	
	public static void main(String[] args) {
		
	}
}