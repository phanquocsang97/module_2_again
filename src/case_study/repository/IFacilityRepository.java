package case_study.repository;

import case_study.model.facility.Facility;

import java.util.Map;

public interface IFacilityRepository {
    Map<Facility,Integer> displayListFacility();
    void addNewFacility(Facility facility);
    Map<Facility,Integer> displayListFacilityMaintenance();
    void removeFacility(Facility facility);
    Facility getByID(String id);
}
