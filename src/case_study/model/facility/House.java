package case_study.model.facility;

public class House extends Facility{
    private String roomStandard;
    private int floorHouse;

    public House() {
    }

    public House(String idService, String nameService, float areaService, double costService, int peopleService, String kindOfRentService, String roomStandard, int floorHouse) {
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

    public int getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(int floorHouse) {
        this.floorHouse = floorHouse;
    }
    public String convertToStringHouse(){
        return idService + "," + nameService + "," + areaService + "," + costService + "," + peopleService + "," +
                kindOfRentService + "," + roomStandard + "," + floorHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                ", idHouse='" + idService + '\'' +
                ", nameHouse='" + nameService + '\'' +
                ", areaHouse='" + areaService + '\'' +
                ", costHouse='" + costService + '\'' +
                ", peopleHouse='" + peopleService + '\'' +
                ", kindOfRentHouse='" + kindOfRentService + '\'' +
                ", roomStandardHouse='" + roomStandard + '\'' +
                ", floorHouse='" + floorHouse + '\'' +
                '}';
    }
}
