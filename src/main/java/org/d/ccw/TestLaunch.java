package org.d.ccw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.d.ccw.data.NewsPapers;

public class TestLaunch {
	public static void main(String[] args) throws IOException {
		NewsReader nrd = new NewsReader();

		Path path = Paths.get("ccw.html");
		Files.createFile(path);
		Files.write(path, nrd.generateWithContent(NewsPapers.DELFI).getBytes());

	}
}
