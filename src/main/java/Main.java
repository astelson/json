import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        Car audi = new Car("Audi100", "red", true, 4200);

        String result = objectMapper.writeValueAsString(audi);

        System.out.println(result);
        System.out.println("Hello World");

    }
}
