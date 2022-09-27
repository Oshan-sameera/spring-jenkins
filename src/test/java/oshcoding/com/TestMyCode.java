package oshcoding.com;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMyCode {

	public static Logger logger = LoggerFactory.getLogger(TestMyCode.class);

	@Test
	public void contextLoads() {
		logger.info("Test case Executing...");
		assertEquals(true, true);
	}

}
