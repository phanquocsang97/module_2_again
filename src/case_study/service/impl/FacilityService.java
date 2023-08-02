package case_study.service.impl;

import case_study.common.exception.FacilityException;
import case_study.common.validate.FacilityValidate;
import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.IFacilityRepository;
import case_study.repository.impl.FacilityRepository;
import case_study.service.IFacilityService;
import case_study.utils.ReadAndWrite;

import java.util.Map;


import static case_study.view.Run.scanner;

public class FacilityService implements IFacilityService {
    private final IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        Map<Facility, Integer> facilityIntegerMap = facilityRepository.displayListFacility();
        if (facilityIntegerMap.isEmpty()) {
            System.out.println("No data in system!!!");
        }
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + " , times using : " + entry.getValue());
        }
    }

    @Override
    public void add() {
        do {
            System.out.println("Enter kind of facility you want to add:" +
                    "\n1.Add Villa" +
                    "\n2.Add House" +
                    "\n3.Add Room" +
                    "\n4.Return main menu");
            int select = ReadAndWrite.inputInput();
            switch (select) {
                case 1:
                    System.out.println("Add villa");
                    addFacility(new Villa());
                    break;
                case 2:
                    System.out.println("Add house");
                    addFacility(new House());
                    break;
                case 3:
                    System.out.println("Add room");
                    addFacility(new Room());
                    break;
                case 4:
                    System.out.println("Return main menu");
                    return;
                default:
                    System.out.println("Input Wrong!!");
                    break;
            }
        } while (true);
    }

    @Override
    public void displayAllMaintenance() {
        Map<Facility, Integer> facilityIntegerMap = facilityRepository.displayListFacilityMaintenance();
        if (facilityIntegerMap.isEmpty()) {
            System.out.println("No facility need to maintenance");
        } else {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                System.out.println(entry.getKey() + ", times using:  " + entry.getValue());
            }
        }
    }

    @Override
    public void remove() {
        display();
        System.out.println("Enter facility you want to remove");
        String idFacility = scanner.nextLine();
        Facility facility = facilityRepository.getByID(idFacility);
        if (facility == null) {
            System.out.println("Facility doesnt exist!!!");
        } else {
            System.out.println("Enter yes if you want to remove");
            String select = scanner.nextLine().toLowerCase().trim();
            if (select.equals("yes")) {
                facilityRepository.removeFacility(facility);
            } else {
                System.out.println("Cancel!!!");
            }
        }
    }

    public void addFacility(Facility facility) {
        if (facility instanceof Villa) {
            System.out.println("Enter id villa");
            String id = "";
            do {
                try {
                    id = scanner.nextLine();
                    if (FacilityValidate.checkIdFacility(id)) {
                        break;
                    }
                } catch (FacilityException e) {
                    System.out.println("Input Wrong!!");
                    ;
                }
            } while (true);
            System.out.println("Enter name villa");
            String name = "";
            do {
                try {
                    name = scanner.nextLine();
//                    name = name.trim();
                    if (FacilityValidate.checkNameFacility(name)) {
                        break;
                    }
                } catch (FacilityException e) {
                    System.out.println("Input Wrong!!!");
                }
            } while (true);
            float area = 0;
            do {
                System.out.println("Enter area villa");
                area = Float.parseFloat(scanner.nextLine());
            } while (!FacilityValidate.checkAreaAndPoolFacility(area));
            double cost = 0;
            do {
                System.out.println("Enter cost villa");
                cost = Double.parseDouble(scanner.nextLine());
            } while (!FacilityValidate.checkCostFacility(cost));
            int people = 0;
            do {
                System.out.println("Enter people villa");
                people = Integer.parseInt(scanner.nextLine());
            } while (!FacilityValidate.checkPeopleFacility(people));
            String kindOfRent = "";
            boolean flag1 = true;
            do {
                System.out.println("Enter kind of rent villa" +
                        "\n1.Hour" +
                        "\n2.Day" +
                        "\n3.Week" +
                        "\n4.Month" );
                int select = ReadAndWrite.inputInput();
                switch (select) {
                    case 1:
                        kindOfRent = "Hour";
                         break;
                    case 2:
                        kindOfRent = "Day";
                        break;
                    case 3:
                        kindOfRent = "Week";
                        break;
                    case 4:
                        kindOfRent = "Month";
                        break;
                    default:
                        flag1 = false;
                        System.out.println("Input Wrong!!!");
                        break;
                }
            } while (!flag1);
            String roomStandard = "";
            boolean flag2 = true;
            do {
                System.out.println("Enter room standard:" +
                        "\n1.Normal Room" +
                        "\n2.Vip Room" +
                        "\n3.President Room");
                int select = ReadAndWrite.inputInput();
                switch (select) {
                    case 1:
                        roomStandard = "Normal Room";
                        break;
                    case 2:
                        roomStandard = "Vip Room";
                        break;
                    case 3:
                        roomStandard = "President Room";
                        break;
                    default:
                        flag2 = false;
                        break;
                }
            } while (!flag2);
            float poolArea = 0;
            do {
                System.out.println("Enter pool area ");
                poolArea = Float.parseFloat(scanner.nextLine());
            } while (!FacilityValidate.checkAreaAndPoolFacility(poolArea));
            int floor = 0;
            do {
                System.out.println("Enter floor");
                floor = Integer.parseInt(scanner.nextLine());
            } while (!FacilityValidate.checkFloorFacility(floor));
            Villa villa = new Villa(id, name, area, cost, people, kindOfRent, roomStandard, poolArea, floor);
            facilityRepository.addNewFacility(villa);
        } else if (facility instanceof House) {
            System.out.println("Enter id House");
            String id = "";
            do {
                try {
                    id = scanner.nextLine();
                    if (FacilityValidate.checkIdFacility(id)) {
                        break;
                    }
                } catch (FacilityException e) {
                    System.out.println("Input Wrong!!");
                    ;
                }
            } while (true);
            System.out.println("Enter name house");
            String name = "";
            do {
                try {
                    name = scanner.nextLine();
                    if (FacilityValidate.checkNameFacility(name)) {
                        break;
                    }
                } catch (FacilityException e) {
                    System.out.println("Input Wrong!!!");
                }
            } while (true);
            float area = 0;
            do {
                System.out.println("Enter area house");
                area = Float.parseFloat(scanner.nextLine());
            } while (!FacilityValidate.checkAreaAndPoolFacility(area));
            double cost = 0;
            do {
                System.out.println("Enter cost house");
                cost = Double.parseDouble(scanner.nextLine());
            } while (!FacilityValidate.checkCostFacility(cost));
            int people = 0;
            do {
                System.out.println("Enter people house");
                people = Integer.parseInt(scanner.nextLine());
            } while (!FacilityValidate.checkPeopleFacility(people));
            String kindOfRent = "";
            boolean flag1 = true;
            do {
                System.out.println("Enter kind of rent house" +
                        "\n1.Hour" +
                        "\n2.Day" +
                        "\n3.Week" +
                        "\n4.Month");
                int select = ReadAndWrite.inputInput();
                switch (select) {
                    case 1:
                        kindOfRent = "Hour";
                        break;
                    case 2:
                        kindOfRent = "Day";
                        break;
                    case 3:
                        kindOfRent = "Week";
                        break;
                    case 4:
                        kindOfRent = "Month";
                        break;
                    default:
                        flag1 = false;
                        break;
                }
            } while (!flag1);
            String roomStandard = "";
            boolean flag2 = true;
            do {
                System.out.println("Enter room standard:" +
                        "\n1.Normal Room" +
                        "\n2.Vip Room" +
                        "\n3.President Room");
                int select = ReadAndWrite.inputInput();
                switch (select) {
                    case 1:
                        roomStandard = "Normal Room";
                        break;
                    case 2:
                        roomStandard = "Vip Room";
                        break;
                    case 3:
                        roomStandard = "President Room";
                        break;
                    default:
                        flag2 = false;
                        break;
                }
            } while (!flag2);
            int floor = 0;
            do {
                System.out.println("Enter floor");
                floor = Integer.parseInt(scanner.nextLine());
            } while (!FacilityValidate.checkFloorFacility(floor));
            House house = new House(id, name, area, cost, people, kindOfRent, roomStandard, floor);
            facilityRepository.addNewFacility(house);
        } else if(facility instanceof Room){
            System.out.println("Enter id room");
            String id = "";
            do {
                try {
                    id = scanner.nextLine();
                    if (FacilityValidate.checkIdFacility(id)) {
                        break;
                    }
                } catch (FacilityException e) {
                    System.out.println("Input Wrong!!");
                    ;
                }
            } while (true);
            System.out.println("Enter name room");
            String name = "";
            do {
                try {
                    name = scanner.nextLine();
                    if (FacilityValidate.checkNameFacility(name)) {
                        break;
                    }
                } catch (FacilityException e) {
                    System.out.println("Input Wrong!!!");
                }
            } while (true);
            float area = 0;
            do {
                System.out.println("Enter area room");
                area = Float.parseFloat(scanner.nextLine());
            } while (!FacilityValidate.checkAreaAndPoolFacility(area));
            double cost = 0;
            do {
                System.out.println("Enter cost room");
                cost = Double.parseDouble(scanner.nextLine());
            } while (!FacilityValidate.checkCostFacility(cost));
            int people = 0;
            do {
                System.out.println("Enter people room");
                people = Integer.parseInt(scanner.nextLine());
            } while (!FacilityValidate.checkPeopleFacility(people));
            String kindOfRent = "";
            boolean flag1 = true;
            do {
                System.out.println("Enter kind of rent room" +
                        "\n1.Hour" +
                        "\n2.Day" +
                        "\n3.Week" +
                        "\n4.Month");
                int select = ReadAndWrite.inputInput();
                switch (select) {
                    case 1:
                        kindOfRent = "Hour";
                        break;
                    case 2:
                        kindOfRent = "Day";
                        break;
                    case 3:
                        kindOfRent = "Week";
                        break;
                    case 4:
                        kindOfRent = "Month";
                        break;
                    default:
                        flag1 = false;
                        break;
                }
            } while (!flag1);
            boolean flag2 = true;
            String freeService = "";
            do {
                System.out.println("Enter service" +
                        "\n1.Water free" +
                        "\n2.Coffee free" +
                        "\n3.Fruit free");
                int select = ReadAndWrite.inputInput();
                switch (select) {
                    case 1:
                        freeService = "Water free";
                        break;
                    case 2:
                        freeService = "Coffee free";
                        break;
                    case 3:
                        freeService = "Fruit free";
                        break;
                    default:
                        System.out.println("Input Wrong!!!");
                        flag2 = false;
                        break;
                }
            } while (!flag2);
            Room room = new Room(id, name, area, cost, people, kindOfRent, freeService);
            facilityRepository.addNewFacility(room);
        }
    }
}
