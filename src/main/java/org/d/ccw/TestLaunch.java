package org.d.ccw;

import org.d.ccw.data.NewsPapers;
import org.d.ccw.producer.CristalClearHtml;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestLaunch {
	public static void main(String[] args) throws IOException {
		NewsReader nrd = new NewsReader();
		
		
		CristalClearHtml ccw = new CristalClearHtml();
		 String totalClearHtml =ccw.makeCCWHtml(nrd.extractMetaData(NewsPapers.DELFI));
		

		Path path = Paths.get("ccw.html");
		Files.delete(path);
		Files.createFile(path);
		Files.write(path, totalClearHtml.getBytes());

	}
}
