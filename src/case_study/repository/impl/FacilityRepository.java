package case_study.repository.impl;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.IFacilityRepository;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private final String FACILITY_PATH_FILE = "D:\\CodeGym\\module_2_again\\src\\case_study\\data\\facility.csv";
    private static final Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    @Override
    public Map<Facility, Integer> displayListFacility() {
        List<String> stringList = ReadAndWrite.readFileBook(FACILITY_PATH_FILE);
        String[] info = null;
        for (String s : stringList) {
            info = s.split(",");
//            switch (info.length) {
//                case 9:
//                    facilityMap.put(new House(info[0], info[1], Float.parseFloat(info[2]),Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6], Integer.parseInt(info[7])), 0);
//                    break;
//                case 10:
//                    facilityMap.put(new Villa(info[0], info[1], Float.parseFloat(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6],Float.parseFloat(info[7]),Integer.parseInt(info[8])), 0);
//                    break;
//                case 8:
//                    facilityMap.put(new Room(info[0], info[1], Float.parseFloat(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6]), 0);
//                    break;
//            }
            if (info.length == 9) {
                facilityMap.put(new House(info[0], info[1], Float.parseFloat(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6], Integer.parseInt(info[7])), Integer.parseInt(info[8]));
            } else if (info.length > 9) {
                facilityMap.put(new Villa(info[0], info[1], Float.parseFloat(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6], Float.parseFloat(info[7]), Integer.parseInt(info[8])), Integer.parseInt(info[9]));
            } else if (info.length < 9) {
                facilityMap.put(new Room(info[0], info[1], Float.parseFloat(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6]), Integer.parseInt(info[7]));
            }
        }
        return facilityMap;
    }

    @Override
    public void addNewFacility(Facility facility) {
        List<String> stringList = ReadAndWrite.readFileBook(FACILITY_PATH_FILE);
        if (facility instanceof Villa) {
            stringList.add(((Villa) facility).convertToStringVilla() + "," + 0);
        } else if (facility instanceof House) {
            stringList.add(((House) facility).convertToStringHouse() + "," + 0);
        } else if (facility instanceof Room) {
            stringList.add(((Room) facility).convertToStringRoom() + "," + 0);
        }
        ReadAndWrite.writeFileBook(FACILITY_PATH_FILE, stringList, false);
    }

    @Override
    public Map<Facility, Integer> displayListFacilityMaintenance() {
        Map<Facility, Integer> integerMap = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getValue() >= 5) {
                integerMap.put(entry.getKey(), entry.getValue());
            }
        }
        return integerMap;
    }

    @Override
    public void removeFacility(Facility facility) {
        facilityMap.remove(facility, facilityMap.get(facility));
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (facility instanceof Villa) {
                stringList.add(entry.getKey().covertToStringFacility() + "," + entry.getValue());
            } else if (facility instanceof House) {
                stringList.add(entry.getKey().covertToStringFacility() + "," + entry.getValue());
            } else if (facility instanceof Room) {
                stringList.add(entry.getKey().covertToStringFacility() + "," + entry.getValue());
            }
        }
        ReadAndWrite.writeFileBook(FACILITY_PATH_FILE, stringList, false);
    }

    @Override
    public Facility getByID(String id) {
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getKey().getIdService().equals(id)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
