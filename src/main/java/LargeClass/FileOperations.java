package main.java.LargeClass;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public FileOperations() {
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
}