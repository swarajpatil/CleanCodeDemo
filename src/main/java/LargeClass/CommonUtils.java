package main.java.LargeClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtils {

    public Date getFormattedDate(String date, String dateFormat) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String dateInString = "7-Jun-2013";
        return formatter.parse(dateInString);
    }

    public int getDateDifference(Date startDate, Date endDate) {
        long diff = startDate.getTime() - endDate.getTime();
        long d = (1000 * 60 * 60 * 24 * 365);
        return Math.round(diff / d);
    }

    public String getTimeFromDate(Date date) {
        SimpleDateFormat localDateFormat = new SimpleDateFormat("HH:mm:ss");
        return localDateFormat.format(date);
    }

    @SuppressWarnings("deprecation")
    public boolean isLeapYear(Date date) {
        int year = date.getYear();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            return true;
        else
            return false;
    }

    public Integer countOfWordInText(String text, String regex) {
        int count = 0;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while (m.find()) {
            count++;
        }
        return count;
    }


    public boolean isPrimeNumber(double number) {
        for (Integer i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    int firstZero(int arr[], int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || arr[mid - 1] == 1) && arr[mid] == 0)
                return mid;

            if (arr[mid] == 1)
                return firstZero(arr, (mid + 1), high);
            else
                return firstZero(arr, low, (mid - 1));
        }
        return -1;
    }

    public int countZeroes(int arr[], int n) {
        int first = firstZero(arr, 0, n - 1);
        if (first == -1)
            return 0;

        return (n - first);
    }

    String findTriplateInArray(int array[], int sum) {
        int l, r;

        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == sum) {
                        return array[i] + " ," + array[j] + " ," + array[k];
                    }
                }
            }
        }
        return "";
    }

    public void listFiles(String path) {

        File folder = new File(path);
        File[] files = folder.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
            } else if (file.isDirectory()) {
                listFiles(file.getAbsolutePath());
            }
        }
    }

    public void copyFile(File file, String destinationPath) throws IOException {
        File newFile = new File(destinationPath + file.getName());
        Files.copy(file.toPath(),
                (newFile).toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public void moveFile(File file, String destinationPath) throws IOException {
        File newFile = new File(destinationPath + file.getName());
        Files.move(file.toPath(),
                (newFile).toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public String getFileContent(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }
}
