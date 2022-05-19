package ss11_stack_queue.pai_tap.he_thong_nhan_vien;

public class Personnel implements Comparable<Personnel> {
    private String name;
    private String gender;
    private String birthday;

    public Personnel() {
    }

    public Personnel(String name, String gender, String birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    @Override
    public int compareTo(Personnel o) {
        int year = Integer.parseInt(this.birthday.substring(6, 10));
        int year1 = Integer.parseInt(o.birthday.substring(6, 10));
        if (year < year1) {
            return 1;
        } else if (year > year1) {
            return -1;
        } else {
            int month = Integer.parseInt(this.birthday.substring(3, 5));
            int month1 = Integer.parseInt(o.birthday.substring(3, 5));
            if (month < month1) {
                return 1;
            } else if (month > month1) {
                return -1;
            } else {
                int day = Integer.parseInt(this.birthday.substring(0, 2));
                int day1 = Integer.parseInt(o.birthday.substring(0, 2));
                if (day < day1) {
                    return 1;
                } else if (day > day1) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
