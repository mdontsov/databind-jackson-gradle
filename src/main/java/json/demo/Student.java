package json.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true) // <- ignore JSON properties Java does not know about
public class Student {

   private int id;
   private String firstName;
   private String lastName;
   private boolean active;
   private Address address;
   private String[] languages;
}
