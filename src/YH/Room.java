package YH;

import java.util.Objects;

public class Room {
    int num;
    String type;
    boolean status;

    public Room() {
    }

    public Room(int num, String type, boolean status) {
        this.num = num;
        this.type = type;
        this.status = status;
    }

    @Override
    public String toString() {
        return "["+num+","+type+","+(status?"空闲":"占用")+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return num == room.num && status == room.status && type.equals(room.type);
    }
}
