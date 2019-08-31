package eu.flate.glc;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.fail;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Ignore("This class only exists to demonstrate how to write the test class (for now).")
public class GameLibraryCuratorTests {

	@Test
	public void contextLoads() {
		// Just fail
		fail();
	}

}
