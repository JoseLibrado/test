package org.example;


import org.example.dto.Employee;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Read extends Validations{
    private String jsonFile;
    private Employee employee;

    public Read(String file){
        this.jsonFile = file;
        this.employee = new Employee();
    }

    public JSONObject getContent() {
        try {
            JSONParser jsonParser = new JSONParser();

            FileReader content = new FileReader(jsonFile);

            JSONObject jsonObject = (JSONObject) jsonParser.parse(content);
            return jsonObject;

        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        return null;
    }

    public Employee response(JSONObject jsonObject, String name) {

        JSONArray list = (JSONArray) jsonObject.get("data");

        for (int i = 0; list.size() > i ; i++ ){
            JSONObject nameEmp = (JSONObject) list.get(i);
            if(nameEmp.get("nombreDeUsuario").equals(name)) {

                employee.setNombreDeUsuario((String) nameEmp.get("nombreDeUsuario"));
                employee.setPerfilUsuario((String) nameEmp.get("perfilUsuario"));
                employee.setCorreoElectronico((String) nameEmp.get("correoElectronico"));
            }
        }
        return employee;
    }

    @Override
    public String isAdmin(Employee employee) {

        return employee.getPerfilUsuario().equals("admin") ?
                super.isAdmin(employee) :
                "Not is Admin";
    }

    @Override
    public String isValidEmail(Employee email) {
    return employee.getCorreoElectronico().contains("@") ?
            super.isValidEmail(email) :
            "Not is a Valid Email ...";
    }
}
