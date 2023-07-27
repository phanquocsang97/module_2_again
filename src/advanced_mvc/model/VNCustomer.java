package advanced_mvc.model;

public class VNCustomer {
    private String idVN;
    private String nameVN;
    private String typeVN;
    private String normVN;

    public VNCustomer() {
    }

    public VNCustomer(String idVN, String nameVN, String typeVN, String normVN) {
        this.idVN = idVN;
        this.nameVN = nameVN;
        this.typeVN = typeVN;
        this.normVN = normVN;
    }

    public String getIdVN() {
        return idVN;
    }

    public void setIdVN(String idVN) {
        this.idVN = idVN;
    }

    public String getNameVN() {
        return nameVN;
    }

    public void setNameVN(String nameVN) {
        this.nameVN = nameVN;
    }

    public String getTypeVN() {
        return typeVN;
    }

    public void setTypeVN(String typeVN) {
        this.typeVN = typeVN;
    }

    public String getNormVN() {
        return normVN;
    }

    public void setNormVN(String normVN) {
        this.normVN = normVN;
    }
}
