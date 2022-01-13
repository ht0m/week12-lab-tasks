package day04;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hours {

    private List<DataBlock> dataBlockList = new ArrayList<>();

    public List<DataBlock> getDataBlockList() {
        return new ArrayList<>(dataBlockList);
    }

    public void getBlocksFromFileHours(Path path)  {
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                dataBlockList.add(new DataBlock(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),Integer.parseInt(scanner.nextLine())));
            }

        } catch (IOException | NumberFormatException e) {
            throw new IllegalStateException("Error while reading file!", e);
        }
    }
    public int getHoursFromBlocks(String nameOfTeacher) {
        int sum = 0;
        for (DataBlock d : dataBlockList) {
            if (nameOfTeacher.equals(d.getName())) {
                sum += d.getLessons();
            }
        }
        return sum;
    }
}

// bufferreader
//beolvasás külön private metódusba
// service osztálynév: az üzleti logika itt megy
// controller osztályok: a megjelenésért felelnek - frontenddel való kkommunikációért
// https://www.youtube.com/watch?v=bBC-nXj3Ng4&t=1310s blockchain technológia