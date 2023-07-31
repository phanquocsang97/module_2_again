package case_study.model.facility;

public class House extends Facility{
    private String roomStandard;
    private String floorHouse;

    public House() {
    }

    public House(String idService, String nameService, String areaService, String costService, String peopleService, String kindOfRentService, String roomStandard, String floorHouse) {
        super(idService, nameService, areaService, costService, peopleService, kindOfRentService);
        this.roomStandard = roomStandard;
        this.floorHouse = floorHouse;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(String floorHouse) {
        this.floorHouse = floorHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                ", idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaService='" + areaService + '\'' +
                ", costService='" + costService + '\'' +
                ", peopleService='" + peopleService + '\'' +
                ", kindOfRentService='" + kindOfRentService + '\'' +
                "roomStandard='" + roomStandard + '\'' +
                ", floorHouse='" + floorHouse + '\'' +
                '}';
    }
}
