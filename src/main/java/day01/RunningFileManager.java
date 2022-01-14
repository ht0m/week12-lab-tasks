package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class RunningFileManager {

    private static final String SEPARATOR = " km;";
    private List<Run> running = new ArrayList<>();

    public void ReadAllLines(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                Run newRun = createRunFromString(line);
                running.add((newRun));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file!", ioe);
        }
    }

    public double getKmFromList(int year, Month month) {
        double sum = 0;
        for (Run r : running) {
            if (r.getDate().getYear() == year && month == r.getDate().getMonth()) {
                sum += r.getKm();
            }
        }
        return sum;
    }

    private Run createRunFromString(String line) {
        String[] fields = line.split(SEPARATOR);
        Run run = new Run(Double.parseDouble(fields[0].trim()), LocalDate.parse(fields[1]));
        return run;
    }
}
