package pai_tap_lon.service.Impl;

import pai_tap_lon.models.NhanVienCongNhat;
import pai_tap_lon.models.NhanVienQuanLy;
import pai_tap_lon.models.NhanVienSanXuat;
import pai_tap_lon.models.Persons;
import pai_tap_lon.service.IService;

public class PersonServiceImpl implements IService {
    private static Persons[] persons = new Persons[1000];

    static {
        persons[0] = new NhanVienQuanLy("Huy", "9/10/1997", "Dn", 12000, 2);
        persons[1] = new NhanVienSanXuat("Lan", "9/7/1998", "Dn", 4);
        persons[2] = new NhanVienCongNhat("An", "8/10/1990", "Hn", 12);
        persons[3] = new NhanVienQuanLy("Hoa", "9/1/1991", "Dn", 12000, 2);
        persons[4] = new NhanVienQuanLy("Hang", "9/10/1992", "Hue", 12000, 2);
    }

    @Override
    public void display() {
        for (Persons item : persons) {
            // phải cho item khác null nếu k sẽ hiển thị lỗi. Vì Persons sẽ duyệt mảng từ 0 tới 1000
            // nhưng mảng chỉ có 5 phần tử. Khi xét đến phần tử null sẽ hiển thị lỗi.
            // Và mảng này 1000 phần tử, k thể thêm phần tử 1001 được.
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayNhanVienQuanLy() {
        for (Persons item : persons) {
            // instanceof để hiển thị nhân viên mình muốn hiển thị ra.
            if (item instanceof NhanVienQuanLy) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayNhanVienCongNhat() {
        for (Persons item : persons) {
            if (item instanceof NhanVienCongNhat) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayNhanVienSanXuat() {
        for (Persons item : persons) {
            if (item instanceof NhanVienSanXuat) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void sort() {
    }

    @Override
    public void sortGiam() {
    }

    @Override
    public void sortName() {

    }
}


