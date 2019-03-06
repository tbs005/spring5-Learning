package com.tbs005.note.stream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * @author 
 *
 */
public class SreamTest {
	public static void main(String[] args) {
		try {
			String content = null;
			try {
				content = new String (Files.readAllBytes(Paths.get(SreamTest.class.getResource("stream.txt").toURI())),StandardCharsets.UTF_8);
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			
			List<String> words = Arrays.asList(content.split("\r\n"));
			
			//流式执行
			long count = words.stream().filter(w -> w.length()>12).count();
			System.out.println(count);
			
			//并行执行
			long count2 = words.parallelStream().filter(w -> w.length()>12).count();
			System.out.println(count2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
