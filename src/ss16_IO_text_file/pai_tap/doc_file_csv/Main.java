package ss16_IO_text_file.pai_tap.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

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

