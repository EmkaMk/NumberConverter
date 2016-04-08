
public class Converter {

	ConvertResult cr;

	public Converter() {
		super();
		cr = new ConvertResult();
	}

	public void convertArgs(String[] args) {
		for (int i = 0; i < args.length; i++) {
			this.convert(args[i]);
		}
	}

	public void convert(String argument) {
		switch (argument) {
		case "zero":
			cr.addResult("0");
			break;
		case "one":
			cr.addResult("1");
			break;
		case "two":
			cr.addResult("2");
			break;
		case "three":
			cr.addResult("3");
			break;
		case "four":
			cr.addResult("4");
			break;
		case "five":
			cr.addResult("5");
			break;
		case "six":
			cr.addResult("6");
			break;
		case "seven":
			cr.addResult("7");
			break;
		case "eight":
			cr.addResult("8");
			break;
		case "nine":
			cr.addResult("9");
			break;
		default:
			System.out.println(argument + " is invalid argument");
		}

	}

	public void print() {
		cr.printResult();
	}
}
