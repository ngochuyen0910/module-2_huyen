package ss3_mang.pai_tap;

public class DemSoLanXuatHienCuaKyTu {
    public static void main(String[] args) {
        String str = "Da Nang rat dep";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Chuỗi có " + count + " kí tự a");
    }
}
