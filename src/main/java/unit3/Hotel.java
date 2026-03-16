package unit3;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Hotel {
    int id;
    int category;
    String name;
    String owner;
    String contact;
    String address;
    String city;
    int cityCode;
    String phone;
    int noRooms;
    int noBeds;


}
