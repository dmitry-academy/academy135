package by.academy.test;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

public class TestFolder {
	@Rule
	public final TestRule globalRule = Timeout.millis(20);
	public static TemporaryFolder tempFolder = new TemporaryFolder();

	@BeforeClass
	public static void createTestFolder() {
		System.out.println(tempFolder.getRoot());
		System.out.println(tempFolder.getRoot());
	}

	@Test
	public void positive() {
		assertTrue(1 == 1);
	}

	@Test
	public void negativeCase() {
		try {
			Thread.currentThread().sleep(30);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
