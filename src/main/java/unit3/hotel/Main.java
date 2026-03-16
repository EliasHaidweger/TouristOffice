package unit3.hotel;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        HotelImporter importer = new HotelImporter();
        List<Hotel> hotels = importer.loadHotelsFromFile();

        for (Hotel h : hotels) {
            System.out.println(h);
        }
    }
}

