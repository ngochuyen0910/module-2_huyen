package pai_tap_lon.service.Impl;

import pai_tap_lon.models.*;
import pai_tap_lon.service.IService;
import pai_tap_lon.utils.ComparatorGiamSalary;
import pai_tap_lon.utils.ComparatorName;
import pai_tap_lon.utils.ComparatorSalary;

import java.util.ArrayList;
import java.util.List;

// Không cần khởi tạo 1000 phần tử trước, vì array list kích thước có thể thay đổi.
//nếu có 1001 nhân viên thì mảng sẽ tự động nhân đôi kích thước lên.
// Ưu điểm của array list là kích thước có thể thay đổi k cần phải khởi tạo kích thước mảng trước,
// còn nhược điểm là tốc độ xử lí chậm hơn so với array.

public class PersonServiceImplArrayList implements IService {
    public static List<Persons> personsList = new ArrayList<>();

    static {
        personsList.add(new NhanVienQuanLy("Huy", "9/10/1997", "Dn", 12000, 2));
        personsList.add(new NhanVienSanXuat("Lan", "9/7/1998", "Dn", 4));
        personsList.add(new NhanVienCongNhat("An", "8/10/1990", "Hn", 12));
        personsList.add(new NhanVienCongNhat("Phuong", "8/1/1999", "Hn", 10));
        personsList.add(new NhanVienCongNhat("Hoa", "8/1/1999", "Hn", 10));
    }

    @Override
    public void display() {
        for (Persons persons : personsList)
            System.out.println(persons);
    }

    @Override
    public void displayNhanVienQuanLy() {

    }

    @Override
    public void displayNhanVienCongNhat() {

    }

    @Override
    public void displayNhanVienSanXuat() {

    }

    @Override
    public void sort() {
        personsList.sort(new ComparatorSalary());
    }

    @Override
    public void sortGiam() {
        personsList.sort(new ComparatorGiamSalary());
    }

    @Override
    public void sortName() {
        personsList.sort(new ComparatorName());
    }
}
