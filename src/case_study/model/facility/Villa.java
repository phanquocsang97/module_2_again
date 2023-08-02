package case_study.model.facility;

public class Villa extends Facility {
    private String kindOfVilla;
    private float areaPoolVilla;
    private int floorVilla;

    public Villa() {
    }

    public Villa(String kindOfVilla, float areaPoolVilla, int floorVilla) {
        this.kindOfVilla = kindOfVilla;
        this.areaPoolVilla = areaPoolVilla;
        this.floorVilla = floorVilla;
    }

    public Villa(String idService, String nameService, float areaService, double costService, int peopleService, String kindOfRentService, String kindOfVilla, float areaPoolVilla, int floorVilla) {
        super(idService, nameService, areaService, costService, peopleService, kindOfRentService);
        this.kindOfVilla = kindOfVilla;
        this.areaPoolVilla = areaPoolVilla;
        this.floorVilla = floorVilla;
    }
    public String convertToStringVilla(){
        return idService + "," + nameService + "," + areaService + "," + costService + "," + peopleService + "," +
                kindOfRentService + "," + kindOfVilla + "," + areaService + "," + floorVilla;
    }

    @Override
    public String toString() {
        return "Villa{" +
                ", idVilla='" + idService + '\'' +
                ", nameVilla='" + nameService + '\'' +
                ", areaVilla='" + areaService + '\'' +
                ", costVilla='" + costService + '\'' +
                ", peopleVilla='" + peopleService + '\'' +
                ", kindOfRentVilla='" + kindOfRentService + '\'' +
                ", kindOfVilla='" + kindOfVilla + '\'' +
                ", areaPoolVilla='" + areaPoolVilla + '\'' +
                ", floorVilla='" + floorVilla + '\'' +
                '}';
    }
}
