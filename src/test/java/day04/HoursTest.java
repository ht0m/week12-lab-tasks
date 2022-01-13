package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HoursTest {

    @Test
    void testGetHours() {
        Path path = Path.of("src/main/resources/beosztas.txt");
        Hours hours = new Hours();
        hours.getBlocksFromFile(path);

        System.out.println(hours.getHoursFromBlocks("Oposszum Opika"));
        System.out.println(hours.getHoursFromBlocks("Emu Emil"));
    }

}