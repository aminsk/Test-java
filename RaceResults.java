import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.concurrent.TimeUnit;

public class RaceResults  extends TimeDuration{

	TimeDuration time;
	 String tagCode;
	
	
	public RaceResults() {
		super(0);
		this.time = new TimeDuration(0) ;
		this.tagCode= "";
			
	}
	
	public void onNewResult(String tagNumber, TimeDuration resultTime) {
		
		this.time = resultTime;
		this.tagCode= tagNumber;
	}
	
	public void printResults() {
		System.out.println("Time taken " + time + "by the competitor  with tagcode "+tagCode);
		
	}

	public static void main(String[] args) {
		// get the current tile 
		String[] TagCodes= {"AA", "BB", "CC", "DD"};
		TimeDuration T1= new TimeDuration (2333);
		TimeDuration T2= new TimeDuration (88333);
		TimeDuration T3= new TimeDuration (99333);		
		RaceResults R1 = new RaceResults();
		RaceResults R2 = new RaceResults();
		RaceResults R3 = new RaceResults();
		R1.onNewResult("BB", T1);
		R2.onNewResult("AA", T2);
		R3.onNewResult("CC", T3);	
		R1.printResults();
		R2.printResults();
		R3.printResults();
			
	}

}
