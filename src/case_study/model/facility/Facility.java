package case_study.model.facility;

public abstract class Facility {
    protected String idService;
    protected String nameService;
    protected float areaService;
    protected double costService;
    protected int peopleService;
    protected String kindOfRentService;

    public Facility() {
    }

    public Facility(String idService, String nameService, float areaService, double costService, int peopleService, String kindOfRentService) {
        this.idService = idService;
        this.nameService = nameService;
        this.areaService = areaService;
        this.costService = costService;
        this.peopleService = peopleService;
        this.kindOfRentService = kindOfRentService;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public float getAreaService() {
        return areaService;
    }

    public void setAreaService(float areaService) {
        this.areaService = areaService;
    }

    public double getCostService() {
        return costService;
    }

    public void setCostService(double costService) {
        this.costService = costService;
    }

    public int getPeopleService() {
        return peopleService;
    }

    public void setPeopleService(int peopleService) {
        this.peopleService = peopleService;
    }

    public String getKindOfRentService() {
        return kindOfRentService;
    }

    public void setKindOfRentService(String kindOfRentService) {
        this.kindOfRentService = kindOfRentService;
    }

    public String covertToStringFacility() {
        return idService + "," + nameService + "," + areaService + "," + costService + "," +
                peopleService + "," + kindOfRentService;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaService='" + areaService + '\'' +
                ", costService='" + costService + '\'' +
                ", peopleService='" + peopleService + '\'' +
                ", kindOfRentService='" + kindOfRentService + '\'' +
                '}';
    }
}
