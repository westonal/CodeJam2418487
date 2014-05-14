package com.codejam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<String> readAllLines = Files
				.readAllLines(
						new File(
								"C:\\Personal\\CodeJam\\contest2418487\\CodeJam2418487\\A-large-practice.in")
								.toPath(), StandardCharsets.UTF_8);

		int size = Math.min(readAllLines.size(),
				Integer.parseInt(readAllLines.get(0)) + 1);
		
		List<String> results = new ArrayList<String>();
		
		for (int i = 1; i < size; i++) {
			String line = readAllLines.get(i);
			// System.out.println(line);
			String[] split = line.split("\\s");
			int rings = CalculateRings.maxRings(Long.parseLong(split[0]),
					Long.parseLong(split[1]));
			String resultLine = String.format("Case #%d: %d", i, rings);
			System.out.println(resultLine);
			results.add(resultLine);
		}
		
		OutputStream s = new FileOutputStream(new File(
								"C:\\Personal\\CodeJam\\contest2418487\\CodeJam2418487\\A-large-practice.out"));
		OutputStreamWriter writer = new OutputStreamWriter(s);
		for(String result:results)
			writer.write(result + "\n");
		writer.flush();
		s.close();
	}
}
