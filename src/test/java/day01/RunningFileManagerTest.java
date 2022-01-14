package day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class RunningFileManagerTest {

    @Test
    void testRunning() {
        Path path = Path.of("src/main/resources/running.csv");
        RunningFileManager runningFileManager = new RunningFileManager();
        runningFileManager.ReadAllLines(path);

        double sum = runningFileManager.getKmFromList(2021, Month.DECEMBER);
        assertEquals(41.2,sum);

        double sum2 = runningFileManager.getKmFromList(2022, Month.JANUARY);
        assertEquals(25.9,sum2,0.000001);
    }

}