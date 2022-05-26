package ss16_IO_text_file.pai_tap.ReadAndWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyFile {
    public static List<String[]> readFile(String pathFile) {
        File file = new File(pathFile);
        List<String[]> list = new ArrayList<>();

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                list.add(arr);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void writeFile(String pathFile, String data) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        writeFile("src\\ss16_IO_text_file\\pai_tap\\ReadAndWriteFile\\target.csv", "Xin chào!!");

        List<String[]> listStr = readFile("src\\ss16_IO_text_file\\pai_tap\\ReadAndWriteFile\\target.csv");
        for (String[] item : listStr) {
            System.out.println(Arrays.toString(item));
            writeFile("src\\ss16_IO_text_file\\pai_tap\\ReadAndWriteFile\\source.csv", Arrays.toString(item));
        }
    }
}
