abstract class Room {
    int days;

    abstract void setDays(int days);

    int getDays() {
        return days;
    };

    abstract float getRent();

}

class SingleRoom extends Room {
    int days;

    @Override
    void setDays(int days) {
        this.days = days;
        super.days = days;
    }

    @Override
    float getRent() {
        return this.days * 300;
    }
}

class DoubleRoom extends Room {
    int days;

    @Override
    void setDays(int days) {
        this.days = days;

    }

    @Override
    float getRent() {
        return days * 600;
    }
}

class Deluxe extends Room {
    int days;

    @Override
    void setDays(int days) {
        this.days = days;
    }

    @Override
    float getRent() {
        return days * 800;
    }
}

class GetRoomType {

    Room getRoomType(String roomType) {
        Room room = null;
        switch (roomType) {
            case "Single" -> room = new SingleRoom();

            case "Double" -> room = new DoubleRoom();

            case "Deluxe" -> room = new Deluxe();
            default -> room = null;
        }
        return room;
    }
}

public class Factory {
    public static void main(String[] args) {
        GetRoomType roomType = new GetRoomType();
        Room room = roomType.getRoomType("Single");
        room.setDays(3);
        System.out.println(room.getRent());

    }
}