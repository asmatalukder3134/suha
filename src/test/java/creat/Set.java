package creat;

import org.testng.annotations.Test;

public class Set {
	@Test
	void log() {
		Get g=new Get();
		g.login();
		g.getName();
		g.setName("aysha");
		g.getPw();
		g.setPw("as888");
		
	}

}
