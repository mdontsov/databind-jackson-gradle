package json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.logging.Logger;

public class Driver {

    private static final Logger logger = Logger.getLogger(Driver.class.getSimpleName());

    public static void main(String[] args) {
        try {
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file and map/convert it to Java POJO
            // Populate Student class using JSON
            Student student = mapper.readValue(new File("data/sample-lite.json"), Student.class);

            // print first and last name
            System.out.println("First name: ".concat(student.getFirstName()));
            System.out.println("Last name: ".concat(student.getLastName()));

        } catch (Exception e) {
            logger.severe(e.toString());
        }
    }
}
