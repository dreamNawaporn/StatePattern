package StatePattern;

public class TestDriver {

	public static void main(String[] args) {
		Context cl = new Context();
		cl.setState(new StartState());
		cl.execute();
		cl.setState(new StartState());
		cl.execute();
	}

}
