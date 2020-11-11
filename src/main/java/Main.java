import org.example.content.Content;
import org.apache.log4j.Logger;


public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        System.out.println("Hello");
        log.error("This is an Error");
        Content content = new Content();
        content.print();

    }
}
