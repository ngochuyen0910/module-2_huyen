package pai_tap_lon.controller;

import pai_tap_lon.service.IPersonIService;
import pai_tap_lon.service.IService;
import pai_tap_lon.service.Impl.PersonServiceImplMap;

public class TestMap {
    public static void main(String[] args) {
        IService iPersonIService = new PersonServiceImplMap();
        iPersonIService.display();
    }
}
