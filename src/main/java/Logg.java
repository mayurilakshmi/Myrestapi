import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=LogManager.getLogger(Logg.class.getName());
		log.debug("Im debugging");
		log.debug("i m present");
		log.error("im nor present");

	}

}
