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
    String phone;
    int noRooms;
    int noBeds;


}
