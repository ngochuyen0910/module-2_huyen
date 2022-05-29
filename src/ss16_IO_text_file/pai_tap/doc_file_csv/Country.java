package ss16_IO_text_file.pai_tap.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Country {
    private int id;
    private String code;
    private String name;

    public Country() {
    }

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Main {

        public static List<String[]> readFile(String pathFile) {
            File file = new File(pathFile);
            List<String[]> list = new ArrayList<>();
            String line = null;
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while ((line = bufferedReader.readLine()) != null) {
                    String[] arr = line.split(",");
                    list.add(arr);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return list;
        }

        public static void main(String[] args) {
            List<String[]> listStr = readFile("src\\ss16_IO_text_file\\pai_tap\\doc_file_csv\\countries.csv");

            for (String[] item : listStr) {
                Country country = new Country(Integer.parseInt(item[0]), item[1], item[2]);
                System.out.println(country);
            }
        }
    }
}
