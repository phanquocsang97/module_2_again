package case_study.model.facility;

public abstract class Facility {
    protected String idService;
    protected String nameService;
    protected String areaService;
    protected String costService;
    protected String peopleService;
    protected String kindOfRentService;

    public Facility() {
    }

    public Facility(String idService, String nameService, String areaService, String costService, String peopleService, String kindOfRentService) {
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

    public String getAreaService() {
        return areaService;
    }

    public void setAreaService(String areaService) {
        this.areaService = areaService;
    }

    public String getCostService() {
        return costService;
    }

    public void setCostService(String costService) {
        this.costService = costService;
    }

    public String getPeopleService() {
        return peopleService;
    }

    public void setPeopleService(String peopleService) {
        this.peopleService = peopleService;
    }

    public String getKindOfRentService() {
        return kindOfRentService;
    }

    public void setKindOfRentService(String kindOfRentService) {
        this.kindOfRentService = kindOfRentService;
    }
    public String covertToStringFacility(){
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
