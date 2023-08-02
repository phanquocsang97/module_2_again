package case_study.common.validate;

import case_study.common.exception.FacilityException;

public class FacilityValidate {
    public static boolean checkIdFacility(String id) throws FacilityException {
        final String REGEX_ID = "^SV+(VL|HO|RO)-[0-9]{4}$";
        if (!id.matches(REGEX_ID)){
            throw new FacilityException("Id not true!!!");
        }
        return true;
    }
    public static boolean checkNameFacility(String name) throws FacilityException {
        final String REGEX_NAME = "^([A-Z][a-z]+\\s)+[a-z]*$";
        if (!name.matches(REGEX_NAME)){
            throw new FacilityException("Name not true!!!");
        }
        return true;
    }
    public static boolean checkAreaAndPoolFacility(float areaPool){
        do {
            try {
                if (areaPool > 30){
                    return true;
                }
                throw new FacilityException("Area Pool not true!!!");
            }catch (FacilityException e){
                System.out.println(e.getMessage());
                return false;
            }
        }while (true);
    }
    public static boolean checkCostFacility(double cost){
        do {
            try {
                if (cost > 0){
                    return true;
                }
                throw new FacilityException("Cost not true!!!");
            }catch (FacilityException e){
                System.out.println(e.getMessage());
                return false;
            }
        }while (true);
    }
    public static boolean checkPeopleFacility(int people){
        do {
            try {
                if (people > 0 && people < 20){
                    return true;
                }
                throw new FacilityException("People not true");
            }catch (FacilityException e){
                System.out.println(e.getMessage());
                return false;
            }
        }while (true);
    }
    public static boolean checkFloorFacility(int floor){
        do {
            try {
                if (floor > 0){
                    return true;
                }
                throw new FacilityException("Floor not true!!!");
            }catch (FacilityException e){
                System.out.println(e.getMessage());
                return false;
            }
        }while (true);
    }
}
