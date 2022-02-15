import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{ \"name\":\"David\", \"position\":\"SOFTWARE_ENGINEER\", \"skilltree\":[ \"Java\", \"Python\", \"JavaScript\" ], \"address\":{ \"street\":\"Street\", \"streetNo\":\"123\" } }";

// ObjectMapper instantiation
        ObjectMapper objectMapper = new ObjectMapper();

// Deserialization into the `Employee` class
        Employee employee = objectMapper.readValue(json, Employee.class);

// Print information
        System.out.println(employee);
    }
}
