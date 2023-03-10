package org.example;

import org.example.dto.Employee;
import org.json.simple.JSONObject;
import java.util.Scanner;

public class Main {

    public static Read fileContent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome..!");

        // Input name
        System.out.println("Enter a name employee..!");
        String name = sc.nextLine();

        // Read File
        fileContent = new Read("src/main/java/org/example/employees.json");
        JSONObject data = fileContent.getContent();

        //Search employee
        Employee empl = fileContent.response(data,name);

        if( empl.getNombreDeUsuario() == null ){
           System.out.println( "Employee do not exists...!" );
        } else {
            System.out.println(fileContent.isAdmin(empl));
            System.out.println(fileContent.isValidEmail(empl));
        }

    }
}