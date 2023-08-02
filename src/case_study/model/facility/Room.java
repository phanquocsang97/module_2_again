package case_study.model.facility;

public class Room extends Facility{
    private String freeServiceRoom;

    public Room() {
    }

    public Room(String freeService) {
        this.freeServiceRoom = freeService;
    }

    public Room(String idService, String nameService, float areaService, double costService, int peopleService, String kindOfRentService, String freeServiceRoom) {
        super(idService, nameService, areaService, costService, peopleService, kindOfRentService);
        this.freeServiceRoom = freeServiceRoom;
    }
    public String convertToStringRoom(){
        return  idService + "," + nameService + "," + areaService + "," + costService + "," + peopleService + "," +
                kindOfRentService + "," + freeServiceRoom;
    }

    @Override
    public String toString() {
        return "Room{" +
                ", idRoom='" + idService + '\'' +
                ", nameRoom='" + nameService + '\'' +
                ", areaRoom='" + areaService + '\'' +
                ", costRoom='" + costService + '\'' +
                ", peopleRoom='" + peopleService + '\'' +
                ", kindOfRentRoom='" + kindOfRentService + '\'' +
                ", freeServiceRoom='" + freeServiceRoom + '\'' +
                '}';
    }
}
