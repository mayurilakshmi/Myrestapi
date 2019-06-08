import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=LogManager.getLogger(Logg2.class.getName());
		log.debug("Im debugging");
		log.debug("i m present");
		log.error("im nor present");

	}

}
