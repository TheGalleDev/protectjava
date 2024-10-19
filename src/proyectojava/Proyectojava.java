/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectojava;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author Camilo Gallego B
 */
public class Proyectojava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String regexPhone = "^\\d{3}-\\d{3}-\\d{4}$";
        String regexDate = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        String regexPostalCode = "^\\d{5}$";

        TestCase[] tests = {
            new TestCase("Correo Electrónico", "test@example.com", regexEmail),
            new TestCase("Número de Teléfono", "123-456-7890", regexPhone),
            new TestCase("Fecha", "15/08/2024", regexDate),
            new TestCase("Código Postal", "12345", regexPostalCode)
        };

        for (TestCase test : tests) {
            Pattern pattern = Pattern.compile(test.regex);
            Matcher matcher = pattern.matcher(test.value);

            if (matcher.matches()) {
                System.out.println(test.type + ": " + test.value + " -> Válido");
            } else {
                System.out.println(test.type + ": " + test.value + " -> No válido");
            }
        }
    }

    static class TestCase {
        String type;
        String value;
        String regex;

        public TestCase(String type, String value, String regex) {
            this.type = type;
            this.value = value;
            this.regex = regex;
        }
    }
}

        
 