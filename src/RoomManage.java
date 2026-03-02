public class RoomManage implements CRUD {
    public void add() {
        System.out.print("Enter room's number: ");
        short number = inputReader.readShort();

        System.out.print("Enter room's capacity: ");
        byte capacity = inputReader.readByte();

        System.out.print("Enter room's description: ");
        String description = inputReader.readLine();

        System.out.print("Enter room's busyness: ");
        boolean isBusy = inputReader.readBoolean();

        //University.addRoom(number, capacity, description, isBusy);

        Room room = new Room();
        room.setNumber(number);
        room.setCapacity(capacity);
        room.setDescription(description);
        room.setBusy(isBusy);

        //finding empty index
        int i = 0;
        while (University.rooms[i] != null) {
            i++;
        }

        University.rooms[i] = room;
    }

    public void remove() {
        printAll();

        System.out.println("Enter the index:");
        int index = inputReader.readInt();

        University.rooms[index] = null;
    }

    public void printAll() {
        Room[] rooms = University.rooms;

        System.out.println("Room List:");
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];

            if (room != null) { //to avoid NullPointerException
                System.out.println(i + "." + room.toString());
            }
        }
    }
}
