package lab13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class FileSearch {
	static boolean found = false;
	// Store the text that is found in the
	// file that is found in this String variable
	static String discoveredText = null;

	public static boolean searchForFile(String filename, String startDir) {

		File dir = new File(startDir);

		String[] dirList = dir.list();
		for (String o : dirList) {
			File file = new File(startDir + File.separator + o);

			if (file.isFile() && o.equals(filename)) {
				FileReader fileReader = null;
				BufferedReader bufreader = null;

				try {
					fileReader = new FileReader(file);

					bufreader = new BufferedReader(fileReader);
					String line = null;
					while ((line = bufreader.readLine()) != null) {
						discoveredText += line;
						System.out.println(discoveredText);
					}

					found = true;
					break;
				} catch (IOException e) {
					System.out.println("Error !!!  while reading file" + e.getMessage());
				} finally {
					try {
						if (fileReader != null) {
							fileReader.close();
						}
						if (bufreader != null) {
							bufreader.close();
						}
					} catch (IOException e) {
						System.out.println("closing error");
					}
				}
			} else if (file.isDirectory()) {
				searchForFile(filename, startDir + File.separator + o);
			}
		}

		return found;

	}



}
