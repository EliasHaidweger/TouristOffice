package unit3.hotel;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        HotelImporter importer = new HotelImporter();
        List<Hotel> hotels = importer.loadHotelsFromFile();

        for (Hotel h : hotels) {
            System.out.println(h);
        }
    }
}

