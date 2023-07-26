package by.academy.lesson18;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileContent {
	public static void main(String... args) {
		File source = new File("test.txt");
		File target = new File("target.txt");

		try {
			if (!source.exists()) {
				source.createNewFile();
			}

			if (!target.exists()) {
				target.createNewFile();
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		try (BufferedInputStream is = new BufferedInputStream(new FileInputStream(source));
				FileOutputStream out = new FileOutputStream(target)) {
			out.write(is.readAllBytes());
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
