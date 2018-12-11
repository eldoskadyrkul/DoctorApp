package com.DoctorApp.service;

import com.DoctorApp.model.Doctor;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.util.DefaultPrettyPrinter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class DoctorService {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final List<Doctor> DOCTORS = new ArrayList<>();

    public void addDoctorWithJson() {
        try {
            DOCTORS.add(addDoctor());
            ObjectWriter writer = OBJECT_MAPPER.writer(new DefaultPrettyPrinter());
            writer.writeValue(new File("doctors.json"), DOCTORS);
            System.out.println(DOCTORS);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Doctor addDoctor() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер врача");
        int i = scanner.nextInt();
        System.out.println("Введите фамилию доктора");
        String a = scanner.next();
        System.out.println("Введите имя доктора");
        String b = scanner.next();
        System.out.println("Введите отчество доктора");
        String c = scanner.next();
        System.out.println("Введите график работы:");
        List<String> s = new ArrayList<>();
        for (int j = 0; j < 7; j++) {
            String v = String.valueOf(scanner.next());
            s.add(v);
        }
        Doctor doctor1 = new Doctor(i, a, b, c, s);
        return doctor1;
    }

    public void showDoctorWithJson() {
        try {
            byte[] file = Files.readAllBytes(Paths.get("doctors.json"));
            List doctor = OBJECT_MAPPER.readValue(file, OBJECT_MAPPER.getTypeFactory().constructCollectionType(List.class, Doctor.class));
            System.out.println(doctor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Doctor> union(List<Doctor> doctors) {
        Set<Doctor> doctorSet = new HashSet<>();

        doctorSet.addAll(doctors);

        return new ArrayList<>(doctorSet);
    }

    public static List<Doctor> intersection(List<Doctor> doctorList) {
        List<Doctor> list = new ArrayList<>();

        for (Doctor d :
                doctorList) {
            if (doctorList.contains(d)) {
                list.add(d);
            }
        }

        return list;
    }

    public void WriteUnion() {
        try {
            byte[] file = Files.readAllBytes(Paths.get("doctors.json"));
            List doctor1 = OBJECT_MAPPER.readValue(file, OBJECT_MAPPER.getTypeFactory().constructCollectionType(List.class, Doctor.class));
            System.out.println("Объединение множеств");
            System.out.println(new DoctorService().union(doctor1));
            System.out.println("Пересечение множеств");
            System.out.println(new DoctorService().intersection(doctor1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
