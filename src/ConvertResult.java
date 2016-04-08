import java.util.ArrayList;

public class ConvertResult {

	private ArrayList<String> result;

	public ConvertResult() {
		super();
		result = new ArrayList<>();
	}

	public void addResult(String res) {
		result.add(res);
	}

	public void printResult() {
		System.out.println("The result is: ");
		for (String s : result) {
			System.out.print(s);
		}
	}

}
