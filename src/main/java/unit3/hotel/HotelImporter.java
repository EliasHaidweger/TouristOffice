package unit3.hotel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelImporter {

    public List<Hotel> loadHotelsFromFile() throws IOException {
        List<Hotel> hotels = new ArrayList<>();
        Scanner scanner = new Scanner(new File("src/main/resources/hotels.txt"));

        scanner.nextLine();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");

            for (int i = 0; i < parts.length; i++) {
                parts[i] = parts[i].replace("\"", "").trim();
            }

            Hotel hotel = Hotel.builder()
                    .id(Integer.parseInt(parts[0]))
                    .category(Integer.parseInt(parts[1]))
                    .name(parts[2])
                    .owner(parts[3])
                    .contact(parts[4])
                    .address(parts[5])
                    .city(parts[6])
                    .cityCode(Integer.parseInt(parts[7]))
                    .phone(parts[8])
                    .noRooms(Integer.parseInt(parts[9]))
                    .noBeds(Integer.parseInt(parts[10]))
                    .build();

            hotels.add(hotel);
        }

        scanner.close();
        return hotels;
    }
}
