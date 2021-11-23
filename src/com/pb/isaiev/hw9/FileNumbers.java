package com.pb.isaiev.hw9;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FileNumbers {
    private static Path path, oddPath;
    public static void main(String[] args) throws IOException {
        path = Files.createFile(Paths.get("numbers.txt"));
        oddPath = Files.createFile(Paths.get("odd-numbers.txt"));
        createNumbersFile();
        createOddNumbersFile();
    }
    public static void createNumbersFile() {
        Random random = new Random();
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int numberOfLines = 0; numberOfLines < 10; numberOfLines++) {
                for (int numberOfDigits = 0; numberOfDigits < 10; numberOfDigits++) {
                    writer.write(String.valueOf(random.nextInt(99)));
                    writer.write(" ");
                }
                writer.newLine();
            }
        } catch (Exception ex) {
            System.out.println("Ошибка записи: " + ex);
        }
        System.out.println("Запись в файл \"" + path.toAbsolutePath() + "\" выполнено!");
    }
    public static void createOddNumbersFile() {
        System.out.println("Чтение с файла \"" + path.toAbsolutePath() + "\":");
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            System.out.println("----------------------------------");
            String line;
            try (BufferedWriter writer = Files.newBufferedWriter(oddPath)) {
                while((line = reader.readLine()) != null) {
                    List<Integer> editedIntList =
                            Arrays.stream(line.split(" "))
                                    .map(Integer::valueOf)
                                    .map(i -> i % 2 == 0 ? 0 : i)
                                    .collect(Collectors.toList());
                    List<String> editedStringList = new ArrayList<>();
                    for (Integer i : editedIntList) {
                        editedStringList.add(String.valueOf(i));
                    }
                    line = String.join(" ", editedStringList);
                    writer.write(line);
                    writer.newLine();
                }
            } catch (Exception ex) {
                System.out.println("Ошибка при записи: " + ex);
            }
            System.out.println("----------------------------------");
        } catch (Exception ex) {
            System.out.println("Ошибка чтения: " + ex);
        }
        System.out.println("Чтение с файла выполнено");

    }
}
