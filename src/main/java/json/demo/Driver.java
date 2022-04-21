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
            Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);

            // print first and last name
            System.out.println("First name: ".concat(student.getFirstName()));
            System.out.println("Last name: ".concat(student.getLastName()));

            // print address
            Address address = student.getAddress();

            System.out.println("Street: ".concat(address.getStreet()));
            System.out.println("City: ".concat(address.getCity()));
            System.out.println("State: ".concat(address.getState()));
            System.out.println("ZIP: ".concat(address.getZip()));
            System.out.println("Country: ".concat(address.getCountry()));

            // print languages
            for (String language: student.getLanguages()) {
                System.out.println("Learning language: ".concat(language));
            }

        } catch (Exception e) {
            logger.severe(e.toString());
        }
    }
}
