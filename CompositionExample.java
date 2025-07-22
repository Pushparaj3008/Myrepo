class Room {
    private String type;

    Room(String type) {
        this.type = type;
    }

    void showRoomType() {
        System.out.println("This is a " + type + " room.");
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalize method called in room");
            // Cleanup code here (e.g., closing file or network connections)
        } finally {
            super.finalize(); // Ensure the superclass finalize is called
        }
    }
}

class House {
    private Room room;  // Composition: House "has-a" Room

    House() {
        room = new Room("Bedroom");  // Room is created inside House
    }

    void showHouseDetails() {
        room.showRoomType();
        System.out.println("This room belongs to the house.");
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalize method called in House");
            // Cleanup code here (e.g., closing file or network connections)
        } finally {
            super.finalize(); // Ensure the superclass finalize is called
        }
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        House house = new House();
        house.showHouseDetails();
        house = null;
        System.gc();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

