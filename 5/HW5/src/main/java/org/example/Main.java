package org.example;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Main {
    public static void main(String[] args) {

    //Задание 1----------------------------------------------------------
        System.out.println("Задание 1-----------------------------------------");
        try {
            File file = new File(new File(".").getPath());
            //список файлов и директорий в текущей директории
            File[] dir = file.listFiles();

            //Вывод содержимого текущей папки
            System.out.println("Содержимое текущей папки: ");
            for (int i = 0; i < dir.length; i++) {
                System.out.println(dir[i]);
            }

            //Создание директории ./backup
            Path pathbackup = Paths.get("./backup");
            if (!Files.exists(Paths.get(pathbackup.toUri()))) {
                Files.createDirectory(Paths.get(pathbackup.toUri()));
                System.out.println("Директория успешно создана?");
                System.out.println(Files.exists(Paths.get(pathbackup.toUri())));
            }

            //Копируем файлы в ./backup
            for (int i = 0; i < dir.length; i++) {
                Files.copy(dir[i].toPath(), pathbackup, REPLACE_EXISTING);
            }

            //Вывод содержимого директории ./backup
            File pathfile = new File(String.valueOf(pathbackup));
            File[] dirbackup = file.listFiles();
            System.out.println("Содержимое директории ./backup: ");
            for (int i = 0; i < dirbackup.length; i++) {
                if (dirbackup[i].isDirectory()) continue;
                System.out.println(dirbackup[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Задание 2-------------------------------------------");
        //Задание 2----------------------------------------------------------------

        /*
        Значения от 0 до 3 будут занимать 2 бита. То есть одна ячейка поля кодируется 2 битами.
        В 1 байт = 8 бит можно записать 4 значения поля, а нам надо 3. Последние два бита каждого байта будут пустыми.
        */

        int[] i_array = {3,1,2,3,0,1,2,3,0}; //исходный массив
        char[] result = new char[3];
        if (i_array.length != 9)
                throw new RuntimeException("Рaзмер исходного массива некорректен");
        int i = 0;
        int k = 0;
        int temp = 0;
        for (int j = 0; j < i_array.length; j++) {
            if (i < 3) {
                if (3 < i_array[j] || i_array[j] < 0)
                    throw new RuntimeException("Элемент массива имеет некорректное значение");
                temp = temp | (char) (i_array[j]) << (6 - 2 * i);
                i++;
            } else {
                j--;
                i = 0;
                result[k] = (char) temp;
                temp = 0;
                k++;
            }
        }
        result[k] = (char) temp;

        for (int y = 0; y < result.length; y++)
            System.out.println(Integer.toBinaryString(result[y]));

        File file = new File("bytes.txt");
        ByteArrayOutputStream out = new ByteArrayOutputStream(3);
        out.write(result[0]);
        out.write(result[1]);
        out.write(result[2]);

        try (FileOutputStream outfile = new FileOutputStream(file);) {
            out.writeTo(outfile);
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}